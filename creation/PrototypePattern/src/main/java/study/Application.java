package study;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle();
		circle.setX(10);
		circle.setY(20);
		circle.setColor(new Color(0, 0, 0));
		circle.setRadius(10);

		Circle cloneCircle = (Circle) circle.clone();
		compare(circle, cloneCircle);

		Rectangle rectangle = new Rectangle();
		rectangle.setX(10);
		rectangle.setY(20);
		rectangle.setColor(new Color(0, 0, 0));
		rectangle.setHeight(10);
		rectangle.setHeight(10);

		Rectangle cloneRectangle = (Rectangle) rectangle.clone();
		compare(rectangle, cloneRectangle);

		compare(circle, rectangle);
		compare(circle, cloneRectangle);

		compare(rectangle, cloneCircle);

		compare(cloneCircle, cloneRectangle);
	}

	private static void compare(Shape a, Shape b) {
		System.out.println(a);
		System.out.println(b);
		if (a != b) {
			System.out.println("다른 객체!");
			if (a.equals(b)) {
				System.out.println("같은 값인 객체.");
			} else {
				System.out.println("다른 값인 객체.");
			}
		} else {
			System.out.println("같은 객체!");
		}
	}
}