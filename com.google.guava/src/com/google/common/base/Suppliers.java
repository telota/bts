/*
 * Copyright (C) 2007 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import javax.annotation.Nullable;

/**
 * Useful suppliers.
 * <p>
 * <p>All methods return serializable suppliers as long as they're given
 * serializable parameters.
 *
 * @author Laurence Gonsalves
 * @author Harry Heymann
 * @since 2.0 (imported from Google Collections Library)
 */
@GwtCompatible
public final class Suppliers {
    private Suppliers() {
    }

    /**
     * Returns a new supplier which is the composition of the provided function
     * and supplier. In other words, the new supplier's value will be computed by
     * retrieving the value from {@code supplier}, and then applying
     * {@code function} to that value. Note that the resulting supplier will not
     * call {@code supplier} or invoke {@code function} until it is called.
     */
    public static <F, T> Supplier<T> compose(
            Function<? super F, T> function, Supplier<F> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(supplier);
        return new SupplierComposition<F, T>(function, supplier);
    }

    /**
     * Returns a supplier which caches the instance retrieved during the first
     * call to {@code get()} and returns that value on subsequent calls to
     * {@code get()}. See:
     * <a href="http://en.wikipedia.org/wiki/Memoization">memoization</a>
     * <p>
     * <p>The returned supplier is thread-safe. The supplier's serialized form
     * does not contain the cached value, which will be recalculated when {@code
     * get()} is called on the reserialized instance.
     * <p>
     * <p>If {@code delegate} is an instance created by an earlier call to {@code
     * memoize}, it is returned directly.
     */
    public static <T> Supplier<T> memoize(Supplier<T> delegate) {
        return (delegate instanceof MemoizingSupplier)
                ? delegate
                : new MemoizingSupplier<T>(Preconditions.checkNotNull(delegate));
    }

    /**
     * Returns a supplier that caches the instance supplied by the delegate and
     * removes the cached value after the specified time has passed. Subsequent
     * calls to {@code get()} return the cached value if the expiration time has
     * not passed. After the expiration time, a new value is retrieved, cached,
     * and returned. See:
     * <a href="http://en.wikipedia.org/wiki/Memoization">memoization</a>
     * <p>
     * <p>The returned supplier is thread-safe. The supplier's serialized form
     * does not contain the cached value, which will be recalculated when {@code
     * get()} is called on the reserialized instance.
     *
     * @param duration the length of time after a value is created that it
     *                 should stop being returned by subsequent {@code get()} calls
     * @param unit     the unit that {@code duration} is expressed in
     * @throws IllegalArgumentException if {@code duration} is not positive
     * @since 2.0
     */
    public static <T> Supplier<T> memoizeWithExpiration(
            Supplier<T> delegate, long duration, TimeUnit unit) {
        return new ExpiringMemoizingSupplier<T>(delegate, duration, unit);
    }

    /**
     * Returns a supplier that always supplies {@code instance}.
     */
    public static <T> Supplier<T> ofInstance(@Nullable T instance) {
        return new SupplierOfInstance<T>(instance);
    }

    /**
     * Returns a supplier whose {@code get()} method synchronizes on
     * {@code delegate} before calling it, making it thread-safe.
     */
    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> delegate) {
        return new ThreadSafeSupplier<T>(Preconditions.checkNotNull(delegate));
    }

    /**
     * Returns a function that accepts a supplier and returns the result of
     * invoking {@link Supplier#get} on that supplier.
     *
     * @since 8.0
     */
    @Beta
    //SupplierFunction works for any T.
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <T> Function<Supplier<T>, T> supplierFunction() {
        return (Function) SupplierFunction.INSTANCE;
    }

    private enum SupplierFunction implements Function<Supplier<?>, Object> {
        INSTANCE;

        @Override
        public Object apply(Supplier<?> input) {
            return input.get();
        }

        @Override
        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    private static class SupplierComposition<F, T>
            implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Function<? super F, T> function;
        final Supplier<F> supplier;

        SupplierComposition(Function<? super F, T> function, Supplier<F> supplier) {
            this.function = function;
            this.supplier = supplier;
        }

        @Override
        public T get() {
            return function.apply(supplier.get());
        }

        @Override
        public boolean equals(@Nullable Object obj) {
            if (obj instanceof SupplierComposition) {
                SupplierComposition<?, ?> that = (SupplierComposition<?, ?>) obj;
                return function.equals(that.function) && supplier.equals(that.supplier);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(function, supplier);
        }

        @Override
        public String toString() {
            return "Suppliers.compose(" + function + ", " + supplier + ")";
        }
    }

    @VisibleForTesting
    static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        transient volatile boolean initialized;
        // "value" does not need to be volatile; visibility piggy-backs
        // on volatile read of "initialized".
        transient T value;

        MemoizingSupplier(Supplier<T> delegate) {
            this.delegate = delegate;
        }

        @Override
        public T get() {
            // A 2-field variant of Double Checked Locking.
            if (!initialized) {
                synchronized (this) {
                    if (!initialized) {
                        T t = delegate.get();
                        value = t;
                        initialized = true;
                        return t;
                    }
                }
            }
            return value;
        }

        @Override
        public String toString() {
            return "Suppliers.memoize(" + delegate + ")";
        }
    }

    @VisibleForTesting
    static class ExpiringMemoizingSupplier<T>
            implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        final long durationNanos;
        transient volatile T value;
        // The special value 0 means "not yet initialized".
        transient volatile long expirationNanos;

        ExpiringMemoizingSupplier(
                Supplier<T> delegate, long duration, TimeUnit unit) {
            this.delegate = Preconditions.checkNotNull(delegate);
            this.durationNanos = unit.toNanos(duration);
            Preconditions.checkArgument(duration > 0);
        }

        @Override
        public T get() {
            // Another variant of Double Checked Locking.
            //
            // We use two volatile reads.  We could reduce this to one by
            // putting our fields into a holder class, but (at least on x86)
            // the extra memory consumption and indirection are more
            // expensive than the extra volatile reads.
            long nanos = expirationNanos;
            long now = Platform.systemNanoTime();
            if (nanos == 0 || now - nanos >= 0) {
                synchronized (this) {
                    if (nanos == expirationNanos) {  // recheck for lost race
                        T t = delegate.get();
                        value = t;
                        nanos = now + durationNanos;
                        // In the very unlikely event that nanos is 0, set it to 1;
                        // no one will notice 1 ns of tardiness.
                        expirationNanos = (nanos == 0) ? 1 : nanos;
                        return t;
                    }
                }
            }
            return value;
        }

        @Override
        public String toString() {
            // This is a little strange if the unit the user provided was not NANOS,
            // but we don't want to store the unit just for toString
            return "Suppliers.memoizeWithExpiration(" + delegate + ", " +
                    durationNanos + ", NANOS)";
        }
    }

    private static class SupplierOfInstance<T>
            implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        SupplierOfInstance(@Nullable T instance) {
            this.instance = instance;
        }

        @Override
        public T get() {
            return instance;
        }

        @Override
        public boolean equals(@Nullable Object obj) {
            if (obj instanceof SupplierOfInstance) {
                SupplierOfInstance<?> that = (SupplierOfInstance<?>) obj;
                return Objects.equal(instance, that.instance);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(instance);
        }

        @Override
        public String toString() {
            return "Suppliers.ofInstance(" + instance + ")";
        }
    }

    private static class ThreadSafeSupplier<T>
            implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;

        ThreadSafeSupplier(Supplier<T> delegate) {
            this.delegate = delegate;
        }

        @Override
        public T get() {
            synchronized (delegate) {
                return delegate.get();
            }
        }

        @Override
        public String toString() {
            return "Suppliers.synchronizedSupplier(" + delegate + ")";
        }
    }
}
