package study;

import java.util.Objects;
import java.util.StringJoiner;

public class Color {

	private int red;
	private int green;
	private int blue;

	public Color() {
		this(0, 0, 0);
	}

	public Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Color color = (Color) o;
		return red == color.red && green == color.green && blue == color.blue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(red, green, blue);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Color.class.getSimpleName() + "[", "]")
			.add("red=" + red)
			.add("green=" + green)
			.add("blue=" + blue)
			.toString();
	}
}