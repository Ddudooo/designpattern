package study.flight;

public class SomeFlight implements Flightable {

	@Override
	public void fly() {
		System.out.println("날 수 있음!");
	}

	@Override
	public void ride() {
		System.out.println("탑승!");
	}
}