package study.adapter;

import study.car.Carable;
import study.flight.Flightable;

public class CarAdapter implements Flightable {

	private final Carable car;

	public CarAdapter(Carable car) {
		this.car = car;
	}

	@Override
	public void fly() {
		car.race();
		System.out.println("...날 수 있는 차...?");
		car.race();
	}

	@Override
	public void ride() {
		car.ride();
	}
}