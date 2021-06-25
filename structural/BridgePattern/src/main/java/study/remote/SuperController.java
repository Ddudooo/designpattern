package study.remote;

import study.device.Device;

public class SuperController extends Remote {

	public SuperController(Device device) {
		super(device);
	}

	public void mute() {
		this.device.setVolume(0);
	}
}