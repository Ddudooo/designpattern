package study;

public class PizzaCustomBuilder extends PizzaBuilder {

	@Override
	public void topping(String topping) {
		builder.topping(topping);
	}

	@Override
	public void cheese(String cheese) {
		builder.cheese(cheese);
	}

	@Override
	public void dough(String dough) {
		builder.dough(dough);
	}
}