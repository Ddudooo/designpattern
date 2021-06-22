package study.product.apple;

import study.product.Case;

public class ICase implements Case {

	@Override
	public void protect() {
		System.out.println("Protected by iCase");
	}
}