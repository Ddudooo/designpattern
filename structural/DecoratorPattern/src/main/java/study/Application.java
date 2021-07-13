package study;

public class Application {

	public static void main(String[] args) {
		Phone cellphone = new CellPhone();
		cellphone.call();

		Phone module3G = new Module3G(cellphone);
		module3G.call();

		Phone module4G = new Module4G(cellphone);
		module4G.call();

		Phone module3GAnd4G = new Module4G(module3G);
		module3GAnd4G.call();
	}
}