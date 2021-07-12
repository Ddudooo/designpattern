package study;

import java.util.Objects;

public abstract class Shape implements Cloneable {

	private int x;
	private int y;
	private Color color;

	public Shape() {
	}

	public Shape(Shape target) {
		if (target != null) {
			this.x = target.x;
			this.y = target.y;
			this.color = target.color;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Shape shape = (Shape) o;
		return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y, color);
	}
}