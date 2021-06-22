package study.product.samsung;

import study.product.Case;

public class PlasticCase implements Case {

	@Override
	public void protect() {
		System.out.println("원가 절감.");
	}
}