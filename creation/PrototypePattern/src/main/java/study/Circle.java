package study;

public class Circle extends Shape {

	private int radius;

	public Circle() {
	}

	public Circle(Circle target) {
		super(target);
		if (target != null) {
			this.radius = target.radius;
		}
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "원형 모양! x = " + this.getX() + ", y = " + this.getY() + ", Color = " + this.getColor()
			+ ", radius = " + this.radius;
	}
}
