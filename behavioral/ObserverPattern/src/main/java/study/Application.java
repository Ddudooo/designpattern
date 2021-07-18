package study;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		int ranInt = new Random().nextInt(10);
		PublisherImpl publisher = new PublisherImpl();
		for (int i = 0; i < ranInt; i++) {
			Observer observer = new ObserverImpl(getRandomStr(10));
			publisher.subscribe(observer);
		}
		publisher.setData("데이터 변경!");
		publisher.notifying();
	}

	private static String getRandomStr(int strSize) {
		int leftLimit = 48; // numeral '0'
		int rightLimit = 122; // letter 'z'
		Random random = new Random();

		return random.ints(leftLimit, rightLimit + 1)
			.filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
			.limit(strSize)
			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			.toString();
	}
}