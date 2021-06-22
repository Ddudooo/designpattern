package study.factory;

import study.product.APU;
import study.product.Camera;
import study.product.Case;
import study.product.Ram;
import study.product.apple.AppleSilicon;
import study.product.apple.HynixRam;
import study.product.apple.ICamera;
import study.product.apple.ICase;

public class Foxconn implements PhoneFactory {

	@Override
	public APU createAPU() {
		return new AppleSilicon();
	}

	@Override
	public Camera createCamera() {
		return new ICamera();
	}

	@Override
	public Case createCase() {
		return new ICase();
	}

	@Override
	public Ram createRam() {
		return new HynixRam();
	}
}