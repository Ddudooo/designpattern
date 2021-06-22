package study.product.apple;

import study.product.Camera;

public class ICamera implements Camera {

	@Override
	public void photograph() {
		System.out.println("Photograph by iCamera.");
	}
}