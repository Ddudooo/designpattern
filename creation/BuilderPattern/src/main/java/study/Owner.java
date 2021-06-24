package study;

public class Owner {

	private PizzaBuilder builder;

	public void setBuilder(PizzaBuilder builder) {
		this.builder = builder;
	}

	public Pizza getPizza() {
		return builder.getPizza();
	}

	public void makePizza() {
		builder.createPizza();
		builder.topping("토핑");
		builder.cheese("치즈");
		builder.dough("도우");
	}
}