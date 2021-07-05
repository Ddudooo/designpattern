package study;

import java.awt.Graphics;

public class Rectangle extends BaseShape {


	private final int width;
	private final int height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.drawRect(getX(), getY(), getWidth() - 1, getHeight() - 1);
	}
}