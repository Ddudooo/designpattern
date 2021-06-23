package study.car;

public class SomeCar implements Carable {

	@Override
	public void race() {
		System.out.println("달릴수 있음!");
	}

	@Override
	public void ride() {
		System.out.println("탑승!");
	}
}