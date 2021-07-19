package study;

public class Person {

	private String name;
	private WorkStrategy part;

	public Person(String name, WorkStrategy part) {
		this.name = name;
		this.part = part;
	}

	public void changePart(WorkStrategy changePart) {
		this.part = changePart;
	}

	public void work() {
		System.out.println(name + "의 업무.");
		part.work();
	}
}