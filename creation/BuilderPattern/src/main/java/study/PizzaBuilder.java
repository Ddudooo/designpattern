package study;

public abstract class PizzaBuilder {

	protected Pizza.Builder builder = new Pizza.Builder();
	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void createPizza() {
		pizza = builder.build();
	}

	public abstract void topping(String topping);

	public abstract void cheese(String cheese);

	public abstract void dough(String dough);
}