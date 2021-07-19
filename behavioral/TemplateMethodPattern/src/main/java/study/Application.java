package study;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		LimitDoc limit = new LimitDoc();
		for (int i = 0; i < 12; i++) {
			limit.write(getRandomStr(new Random().nextInt(10)));
		}
		limit.print();

		UnLimitDoc unLimitDoc = new UnLimitDoc();

		for (int i = 0; i < 12; i++) {
			unLimitDoc.write(getRandomStr(new Random().nextInt(10)));
		}
		unLimitDoc.print();
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