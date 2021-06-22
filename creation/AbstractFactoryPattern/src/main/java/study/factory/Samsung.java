package study.factory;

import study.product.APU;
import study.product.Camera;
import study.product.Case;
import study.product.Ram;
import study.product.samsung.Exynos;
import study.product.samsung.PlasticCase;
import study.product.samsung.SamsungRam;
import study.product.samsung.X100000000Camera;

public class Samsung implements PhoneFactory {

	@Override
	public APU createAPU() {
		return new Exynos();
	}

	@Override
	public Camera createCamera() {
		return new X100000000Camera();
	}

	@Override
	public Case createCase() {
		return new PlasticCase();
	}

	@Override
	public Ram createRam() {
		return new SamsungRam();
	}
}