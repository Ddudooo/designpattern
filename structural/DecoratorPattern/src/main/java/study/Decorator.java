package study;

public abstract class Decorator implements Phone {

	private final Phone target;

	public Decorator(Phone target) {
		this.target = target;
	}

	@Override
	public void call() {
		target.call();
	}
}