package study.product.samsung;

import study.product.Ram;

public class SamsungRam implements Ram {

	@Override
	public void store() {
		System.out.println("아무튼 용량큼.");
	}
}