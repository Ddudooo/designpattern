package study;

public class MoneyCashier implements Cashier<Money> {

	private Bundle bundle;
	private int idx = 0;

	public MoneyCashier(Bundle<Money> moneyBundle) {
		this.bundle = moneyBundle;
	}

	@Override
	public boolean hasNext() {
		return idx < bundle.getSize();
	}

	@Override
	public Money next() {
		return (Money) bundle.getAt(idx++);
	}
}