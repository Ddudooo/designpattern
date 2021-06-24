package study;

public class Application {

	public static void main(String[] args) {
		Pizza pizza = new Pizza.Builder()
			.cheese("치즈")
			.dough("도우")
			.topping("토핑")
			.build();

		Owner owner = new Owner();

		PizzaCustomBuilder pizzaCustomBuilder = new PizzaCustomBuilder();
		owner.setBuilder(pizzaCustomBuilder);
		owner.makePizza();
		Pizza pizza1 = owner.getPizza();
	}
}