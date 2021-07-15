package study;

public class Application {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		if (singleton1 == singleton2) {
			System.out.println("같은 객체");
			if (singleton1.equals(singleton2)) {
				System.out.println("동등성 보장");
			} else {
				System.out.println("동등성 보장 안됨.");
			}
		} else {
			System.out.println("다른 객체");
		}

		singleton1.doSomeThing();
		singleton2.doSomeThing();

		Singleton.doSomeThing();
	}
}