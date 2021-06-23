package study.validator;

import java.util.ArrayList;
import java.util.List;

public class CharValidator extends ChainValidation<String> {

	private final List<Character> unableSpecificChars = new ArrayList<>();

	public CharValidator(char... unableSpecificChars) {
		for (char character : unableSpecificChars) {
			this.unableSpecificChars.add(character);
		}
	}

	@Override
	public void validate(String s) throws Exception {
		for (char c : s.toCharArray()) {
			if (unableSpecificChars.contains(c)) {
				throw new IllegalArgumentException("허용하지 않는 문자가 입력되어 있음.");
			}
		}
		System.out.println(s + " 비허용 문자가 포함되지 않은 올바른 문자열");
		next.validate(s);
	}
}