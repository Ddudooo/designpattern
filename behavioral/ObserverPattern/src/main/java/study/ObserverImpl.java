package study;

import java.util.StringJoiner;

public class ObserverImpl implements Observer {

	private final String name;
	private String data;

	public ObserverImpl(String name) {
		this.name = name;
		this.data = "";
	}

	@Override
	public void notice(Publisher publisher) {
		System.out.println(this + " 변경 감지!");
		this.data = publisher.getData();
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", ObserverImpl.class.getSimpleName() + "[", "]")
			.add("name='" + name + "'")
			.add("data='" + data + "'")
			.toString();
	}
}