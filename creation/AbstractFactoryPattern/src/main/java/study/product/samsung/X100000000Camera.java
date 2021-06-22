package study.product.samsung;

import study.product.Camera;

public class X100000000Camera implements Camera {

	@Override
	public void photograph() {
		System.out.println("카메라 촬영.");
	}
}