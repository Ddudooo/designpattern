package study;

import java.util.StringJoiner;

public class Memento {

	private final String data;
	private final int num;

	public Memento(Originator origin) {
		this.data = origin.getData();
		this.num = origin.getNum();
	}

	public String getData() {
		return data;
	}

	public int getNum() {
		return num;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Memento.class.getSimpleName() + "[", "]")
			.add("data='" + data + "'")
			.add("num=" + num)
			.toString();
	}
}