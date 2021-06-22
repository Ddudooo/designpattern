package study;

import study.factory.Foxconn;
import study.factory.PhoneFactory;
import study.factory.Samsung;

public class Application {

	public static void main(String[] args) {
		System.out.println("추상 메소드 팩토리 패턴 공부!");
		createAndTest(new Foxconn());
		createAndTest(new Samsung());
	}

	private static void createAndTest(PhoneFactory factory) {
		factory.createAPU().calculate();
		factory.createCamera().photograph();
		factory.createCase().protect();
		factory.createRam().store();
	}
}