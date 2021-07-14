package study;

import java.util.StringJoiner;

public class Money {

	private int amount;

	private Material material;

	public Money(int amount, Material material) {
		this.amount = amount;
		this.material = material;
	}

	public int getAmount() {
		return amount;
	}

	public Material getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Money.class.getSimpleName() + "[", "]")
			.add("amount=" + amount)
			.add("material=" + material)
			.toString();
	}
}