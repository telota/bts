/******************************************************************************
 Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import com.google.inject.ImplementedBy;

/**
 * @author Sebastian Zarnekow
 * @author Michael Clay
 */
@ImplementedBy(IImageHelper.NullImageHelper.class)
public interface IImageHelper {

    Image getImage(String name);

    Image getImage(ImageDescriptor imageDescriptor);

    /**
     * @since 2.4
     */
    @ImplementedBy(IImageHelper.NullImageHelper.class)
    interface IImageDescriptorHelper {
        ImageDescriptor getImageDescriptor(String name);

        ImageDescriptor getImageDescriptor(Image image);
    }

    class NullImageHelper implements IImageHelper, IImageDescriptorHelper {

        public Image getImage(String name) {
            return null;
        }

        public Image getImage(ImageDescriptor imageDescriptor) {
            return null;
        }

        /**
         * @since 2.4
         */
        public ImageDescriptor getImageDescriptor(String name) {
            return null;
        }

        /**
         * @since 2.4
         */
        public ImageDescriptor getImageDescriptor(Image image) {
            return null;
        }
    }

}
