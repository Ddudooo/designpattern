package study;

public class Application {

	public static void main(String[] args) {
		Phone phone = new Phone("휴대폰");
		System.out.println("========================================");
		phone.changeState(FlightMode.getInstance());
		System.out.println("========================================");
		phone.changeState(MannerMode.getInstance());
		System.out.println("========================================");
		phone.changeState(DefaultMode.getInstance());
	}
}