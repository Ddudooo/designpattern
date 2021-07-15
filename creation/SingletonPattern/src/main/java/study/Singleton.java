package study;

public class Singleton {

	private static Singleton singleton;

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public synchronized static void doSomeThing() {
		System.out.println("무언가 행동.");
	}
}