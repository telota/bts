package org.bbaw.bts.core.commons.exceptions;

public class BTSRuntimeException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = -779452012563350209L;

    public BTSRuntimeException(String message) {
        super(message);

    }

    public BTSRuntimeException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
