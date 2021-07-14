package study;

import java.util.Arrays;

public class MoneyBundle implements Bundle<Money> {

	private final int EXPEND_SIZE = 10;
	private Money[] bundle;
	private int last = 0;

	public MoneyBundle(int size) {
		this.bundle = new Money[size];
	}

	@Override
	public void add(Money money) {
		if (last >= this.bundle.length) {
			bundle = Arrays.copyOf(bundle, bundle.length + EXPEND_SIZE);
		}
		this.bundle[last++] = money;
	}

	public Money getAt(int idx) {
		return bundle[idx];
	}

	@Override
	public int getSize() {
		return last;
	}


	@Override
	public Cashier<Money> iterate() {
		return new MoneyCashier(this);
	}
}