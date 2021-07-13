package study;

public class Module4G extends Decorator {

	public Module4G(Phone target) {
		super(target);
	}

	@Override
	public void call() {
		System.out.println("4G 망으로 연결합니다!");
		super.call();
	}
}