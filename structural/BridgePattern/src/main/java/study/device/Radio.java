package study.device;

public class Radio implements Device {

	private boolean power = false;

	private int volume = 50;

	private int channel = 10;

	@Override
	public boolean isEnable() {
		return this.power;
	}

	@Override
	public void enable() {
		this.power = true;
	}

	@Override
	public void disable() {
		this.power = false;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public int getChannel() {
		return this.channel;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}
}