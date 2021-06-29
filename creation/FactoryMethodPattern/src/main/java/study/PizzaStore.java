package study;

public abstract class PizzaStore {

	public Pizza order(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(String type);
}