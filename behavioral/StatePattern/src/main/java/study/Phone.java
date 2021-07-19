package study;

public class Phone {

	private State state;
	private String name;
	private int volume = 10;
	private boolean dataConnect = false;
	private boolean wifiConnect = false;

	public Phone(String name) {
		this.name = name;
		this.state = DefaultMode.getInstance();
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isDataConnect() {
		return dataConnect;
	}

	public void setDataConnect(boolean dataConnect) {
		this.dataConnect = dataConnect;
	}

	public boolean isWifiConnect() {
		return wifiConnect;
	}

	public void setWifiConnect(boolean wifiConnect) {
		this.wifiConnect = wifiConnect;
	}

	public void changeState(State state) {
		this.state = state;
		this.state.handle(this);
	}
}