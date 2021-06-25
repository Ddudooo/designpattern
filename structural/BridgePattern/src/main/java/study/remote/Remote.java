package study.remote;

import study.device.Device;

public abstract class Remote {

	protected final Device device;

	public Remote(Device device) {
		this.device = device;
	}

	public void togglePower() {
		if (device.isEnable()) {
			device.disable();
		} else {
			device.enable();
		}
	}

	public void volumeDown() {
		device.setVolume(Math.max(device.getVolume() - 10, 0));
	}

	public void volumeUp() {
		device.setVolume(Math.min(device.getVolume() + 10, 100));
	}

	public void channelDown() {
		device.setChannel(Math.max(device.getChannel() - 1, 0));
	}

	public void channelUp() {
		device.setChannel(Math.min(device.getChannel() + 1, 500));
	}
}
