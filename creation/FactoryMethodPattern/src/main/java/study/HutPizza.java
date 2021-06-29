package study;

public class HutPizza implements Pizza {

	private final String type;

	public HutPizza(String type) {
		this.type = type;
	}

	@Override
	public void prepare() {
		System.out.println("피자헛 피자");
		System.out.println("준비");
	}

	@Override
	public void bake() {
		System.out.println("피자헛 피자");
		System.out.println("굽기");
	}

	@Override
	public void box() {
		System.out.println("피자헛 피자");
		System.out.println("포장");
	}
}