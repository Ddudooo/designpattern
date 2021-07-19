package study;

public class Application {

	public static void main(String[] args) {
		Person person = new Person("홍길동", new Backend());
		person.work();
		person.changePart(new Frontend());
		person.work();
		person.changePart(new Design());
		person.work();
		person.changePart(new Planner());
		person.work();
	}
}