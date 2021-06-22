package study.factory;

import study.product.APU;
import study.product.Camera;
import study.product.Case;
import study.product.Ram;

public interface PhoneFactory {

	public APU createAPU();

	public Camera createCamera();

	public Case createCase();

	public Ram createRam();
}
