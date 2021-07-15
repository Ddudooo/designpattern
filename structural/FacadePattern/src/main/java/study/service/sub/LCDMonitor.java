package study.service.sub;

public class LCDMonitor implements VideoSystem {

	private boolean connected;

	@Override
	public void connect() {
		System.out.println("비디오 연결됨.");
		connected = true;
	}

	@Override
	public void visualize() {
		System.out.println("화면 송출");
	}

	@Override
	public void unVisualize() {
		System.out.println("화면 송출 중단.");
	}
}