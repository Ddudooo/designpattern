package study;

public class MannerMode implements State {

	private static MannerMode mannerMode = new MannerMode();

	private MannerMode() {
	}

	public static MannerMode getInstance() {
		return mannerMode;
	}

	@Override
	public void handle(Phone phone) {
		System.out.println("매너 모드로 전환합니다");
		phone.setVolume(0);
		System.out.println("볼륨을 낮춥니다");
	}

	@Override
	public String toString() {
		return "매너 모드";
	}
}