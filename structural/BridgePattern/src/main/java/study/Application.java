package study;

import study.device.Radio;
import study.device.TeleVision;
import study.remote.SuperController;

public class Application {

	public static void main(String[] args) {
		Radio radio = new Radio();
		TeleVision tv = new TeleVision();

		// 구현체 변경으로 구현 분리.
		SuperController controller = new SuperController(radio);
		controller = new SuperController(tv);
	}
}