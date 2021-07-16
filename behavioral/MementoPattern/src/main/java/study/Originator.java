package study;

import java.util.StringJoiner;

public class Originator {

	private String data;
	private int num;

	public Originator() {
	}

	public Memento createMemento() {
		System.out.println("데이터 스냅샷!");
		System.out.println(this);
		return new Memento(this);
	}

	public void migration(Memento memento) {
		System.out.println("데이터 스냅샷으로 불러옵니다!");
		System.out.println(memento);
		System.out.println(this);
		this.data = memento.getData();
		this.num = memento.getNum();
	}

	public int getNum() {
		return num;
	}

	public String getData() {
		return data;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Originator.class.getSimpleName() + "[", "]")
			.add("data='" + data + "'")
			.add("num=" + num)
			.toString();
	}
}