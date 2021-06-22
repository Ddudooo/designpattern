package study.product.apple;

import study.product.Ram;

public class HynixRam implements Ram {

	@Override
	public void store() {
		System.out.println("하이닉스 램.");
	}
}