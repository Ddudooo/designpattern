package study;

public class PizzaHut extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		return new HutPizza(type);
	}
}