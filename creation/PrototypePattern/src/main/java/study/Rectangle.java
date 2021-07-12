package study;

public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(Rectangle target) {
		super(target);
		if (target != null) {
			target.width = this.width;
			target.height = this.height;
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "사각형 모양! x = " + this.getX() + ", y = " + this.getY() + ", Color = " + this
			.getColor()
			+ ", height = " + this.getHeight() + ", weight = " + this.getWidth();
	}
}