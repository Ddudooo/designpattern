package study;

import java.awt.Graphics;

public class Circle extends BaseShape {

	private final int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public int getWidth() {
		return radius * 2;
	}

	@Override
	public int getHeight() {
		return radius * 2;
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.drawOval(getX(), getY(), getWidth() - 1, getHeight() - 1);
	}
}