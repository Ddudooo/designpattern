package study.service.sub;

public class SurroundAudio implements AudioSystem {

	private final int MAX_VALUME = 100;
	private final int MIN_VALUME = 0;

	private final int VOLUME_INTERVAL = 10;

	private boolean connected;
	private int volume = 0;

	@Override
	public void connect() {
		System.out.println("오디오 연결됨");
		this.connected = true;
	}

	@Override
	public void mute() {
		System.out.println("음소거 처리.");
		volume = MIN_VALUME;
	}

	@Override
	public void volumeUp() {
		System.out.println("음량 증가");
		volume = Math.min(MAX_VALUME, volume + VOLUME_INTERVAL);
	}

	@Override
	public void volumeDown() {
		System.out.println("음량 감소");
		volume = Math.max(MIN_VALUME, volume - VOLUME_INTERVAL);
	}
}