package study;

public class Application {

	public static void main(String[] args) {
		PizzaHut pizzaHut = new PizzaHut();
		Pizza cheesePizza = pizzaHut.createPizza("치즈");
		Pizza pepperoni = pizzaHut.createPizza("페퍼로니");
	}
}