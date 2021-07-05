package study;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public abstract class BaseShape implements Shape {

	private int x;
	private int y;
	private boolean selected = false;

	public BaseShape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public boolean isInsideBounds(int x, int y) {
		return x > getX() && x < (getX() + getWidth()) &&
			y > getY() && y < (getY() + getHeight());
	}

	@Override
	public void select() {
		selected = true;
	}

	@Override
	public void unSelect() {
		selected = false;
	}

	@Override
	public boolean isSelected() {
		return selected;
	}

	void enableSelectionStyle(Graphics graphics) {
		graphics.setColor(Color.LIGHT_GRAY);

		Graphics2D g2 = (Graphics2D) graphics;
		float dash1[] = {2.0f};
		g2.setStroke(new BasicStroke(1.0f,
			BasicStroke.CAP_BUTT,
			BasicStroke.JOIN_MITER,
			2.0f, dash1, 0.0f));
	}

	void disableSelectionStyle(Graphics graphics) {
		graphics.setColor(Color.getHSBColor(new Random().nextFloat(), new Random().nextFloat(),
			new Random().nextFloat()));
		Graphics2D g2 = (Graphics2D) graphics;
		g2.setStroke(new BasicStroke());
	}


	@Override
	public void paint(Graphics graphics) {
		if (isSelected()) {
			enableSelectionStyle(graphics);
		} else {
			disableSelectionStyle(graphics);
		}
	}
}