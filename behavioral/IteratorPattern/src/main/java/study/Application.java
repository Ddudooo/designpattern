package study;

import static study.Material.COIN;
import static study.Material.PAPER;

public class Application {

	public static void main(String[] args) {
		Bundle<Money> moneyBundle = new MoneyBundle(10);
		moneyBundle.add(new Money(100, COIN));
		moneyBundle.add(new Money(1000, PAPER));
		moneyBundle.add(new Money(5000, PAPER));
		moneyBundle.add(new Money(10000, PAPER));
		moneyBundle.add(new Money(50, COIN));

		Cashier<Money> cashier = new MoneyCashier(moneyBundle);
		while (cashier.hasNext()) {
			Money next = cashier.next();
			System.out.println(next);
		}
	}
}