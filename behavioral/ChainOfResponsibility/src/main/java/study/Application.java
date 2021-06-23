package study;

import study.validator.CharValidator;
import study.validator.LengthValidator;
import study.validator.StrValidator;

public class Application {

	public static void main(String[] args) {
		StrValidator strValidator = new StrValidator();
		LengthValidator lengthValidator = new LengthValidator(10);
		CharValidator charValidator = new CharValidator('-', '_', '+', '=');

		strValidator.setNext(lengthValidator);
		lengthValidator.setNext(charValidator);

		String testCase = "책임연쇄테스트용";
		String testCase2 = "아무 문자열이나 10자이상의 문자열";
		String testCase3 = "_+_+)-=-=";
		strValidate(strValidator, testCase);
		strValidate(strValidator, testCase2);
		strValidate(strValidator, testCase3);
	}

	private static void strValidate(StrValidator strValidator, String testStr) {
		try {
			strValidator.validate(testStr);
		} catch (Exception e) {
			System.out.println(testStr + " 문자열 확인.");
			System.out.println(e.getMessage());
		}
	}
}