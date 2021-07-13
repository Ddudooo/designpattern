package study;

public class Module3G extends Decorator {

	public Module3G(Phone target) {
		super(target);
	}

	@Override
	public void call() {
		System.out.println("3G 망으로 연결합니다!");
		super.call();
	}
}