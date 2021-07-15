package study;

import study.service.TelevisionService;
import study.service.sub.AudioSystem;
import study.service.sub.LCDMonitor;
import study.service.sub.SurroundAudio;
import study.service.sub.VideoSystem;

public class Application {

	public static void main(String[] args) {
		AudioSystem audio = new SurroundAudio();
		VideoSystem video = new LCDMonitor();
		TelevisionService televisionService = new TelevisionService(audio, video);

		System.out.println("========================");
		televisionService.connect();
		System.out.println("========================");
		televisionService.turnOn();
		System.out.println("========================");
		televisionService.turnOff();
		System.out.println("========================");
	}
}