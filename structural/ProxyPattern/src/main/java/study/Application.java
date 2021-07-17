package study;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		Document document = new Document();
		Writable proxy = new DocumentProxy(document);

		System.out.println("==============[무작위 입력]==============");
		int ranInt = new Random().nextInt(10);
		for (int i = 0; i < ranInt; i++) {
			proxy.write(getRandomStr());
		}
		System.out.println("==============[페이지 출력]==============");
		proxy.print();
		System.out.println("==============[페이지 저장]==============");
		proxy.save();
	}

	private static String getRandomStr() {
		int leftLimit = 48; // numeral '0'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();

		return random.ints(leftLimit, rightLimit + 1)
			.filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
			.limit(targetStringLength)
			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			.toString();
	}
}