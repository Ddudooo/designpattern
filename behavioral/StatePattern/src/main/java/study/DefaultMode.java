package study;

public class DefaultMode implements State {

	private static DefaultMode defaultMode = new DefaultMode();
	private Phone phone;

	private DefaultMode() {
	}

	public static DefaultMode getInstance() {
		return defaultMode;
	}

	@Override
	public void handle(Phone phone) {
		System.out.println("기본 모드로 전환합니다.");
		phone.setDataConnect(true);
		phone.setWifiConnect(true);
		phone.setVolume(Math.min(phone.getVolume() + 10, 50));
	}

	@Override
	public String toString() {
		return "기본 모드";
	}
}