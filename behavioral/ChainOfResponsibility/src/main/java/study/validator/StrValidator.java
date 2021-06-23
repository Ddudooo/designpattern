package study.validator;

public class StrValidator extends ChainValidation<String> {

	@Override
	public void validate(String s) throws Exception {
		next.validate(s);
	}
}