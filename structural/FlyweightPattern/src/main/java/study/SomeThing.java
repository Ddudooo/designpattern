package study;

import java.util.StringJoiner;

public class SomeThing {

	private String data;

	public SomeThing(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", SomeThing.class.getSimpleName() + "[", "]")
			.add("data='" + data + "'")
			.toString();
	}
}