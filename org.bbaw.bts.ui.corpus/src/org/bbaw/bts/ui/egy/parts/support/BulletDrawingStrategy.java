package org.bbaw.bts.ui.egy.parts.support;

import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationPainter.IDrawingStrategy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;

public class BulletDrawingStrategy implements IDrawingStrategy
{

	@Override
	public void draw(Annotation annotation, GC gc, StyledText textWidget, int offset, int length, Color color)
	{
		if (gc != null)
		{
			final Color foreground = gc.getForeground();

			Point left = textWidget.getLocationAtOffset(offset);
			Point right = textWidget.getLocationAtOffset(offset + length);
			if (left.x > right.x)
			{
				// hack: sometimes linewrapping text widget gives us the wrong x/y for the first character of a line that
				// has been wrapped.
				left.x = 0;
				left.y = right.y;
			}
			right.x = textWidget.getClientArea().width;

			int baseline = textWidget.getBaseline(offset);

			int vcenter = left.y + (baseline / 2) + (baseline / 4);

			gc.setLineWidth(0); // NOTE: 0 means width is 1 but with optimized performance
			gc.setLineStyle(SWT.LINE_SOLID);

			left.x += 3;
			right.x -= 5;
			vcenter -= 2;

			if (right.x > left.x)
			{
				// draw the shadow
				gc.setForeground(new Color(gc.getDevice(), new RGB(100, 100, 100)));
				gc.drawRectangle(left.x, vcenter, right.x - left.x, 2);

				// draw the horizontal rule
				gc.setForeground(color);
				gc.drawLine(left.x, vcenter, right.x, vcenter);
				gc.drawLine(left.x, vcenter, left.x, vcenter + 2);
			}

			gc.setForeground(foreground);
		} else
		{
			textWidget.redrawRange(offset, length, true);
		}
	}

}
