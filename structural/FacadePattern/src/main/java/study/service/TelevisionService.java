package study.service;

import study.service.sub.AudioSystem;
import study.service.sub.VideoSystem;

public class TelevisionService {

	private final AudioSystem audio;
	private final VideoSystem video;


	public TelevisionService(AudioSystem audio, VideoSystem video) {
		this.audio = audio;
		this.video = video;
	}

	public void connect() {
		System.out.println("텔레비전 서비스 연결");
		audio.connect();
		video.connect();
	}

	public void turnOn() {
		audio.volumeUp();
		video.visualize();
	}

	public void turnOff() {
		audio.mute();
		video.unVisualize();
	}
}