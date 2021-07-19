package study;

public class FlightMode implements State {

	private static FlightMode flightMode = new FlightMode();

	private FlightMode() {
	}

	public static FlightMode getInstance() {
		return flightMode;
	}

	@Override
	public void handle(Phone phone) {
		System.out.println("비행기 모드로 전환합니다");
		System.out.println("데이터 연결을 끊습니다");
		phone.setDataConnect(false);
		System.out.println("와이파이 연결을 끊습니다");
		phone.setWifiConnect(false);
	}

	@Override
	public String toString() {
		return "비행기 모드";
	}
}