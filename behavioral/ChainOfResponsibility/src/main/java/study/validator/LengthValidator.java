package study.validator;

public class LengthValidator extends ChainValidation<String> {

	private final int MAX_LENGTH;

	public LengthValidator(int maxLength) {
		this.MAX_LENGTH = maxLength;
	}

	@Override
	public void validate(String s) throws Exception {
		if (!s.isEmpty() && s.length() <= MAX_LENGTH) {
			System.out.println(s + " 는 길이가 적절함.");
			next.validate(s);
		}
		throw new IllegalArgumentException("문자열 길이를 맞춰주세요");
	}
}