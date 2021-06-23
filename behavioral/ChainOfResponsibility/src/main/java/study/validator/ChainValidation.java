package study.validator;

public abstract class ChainValidation<T> {

	protected ChainValidation<T> next;

	public abstract void validate(T t) throws Exception;

	public void setNext(ChainValidation<T> validator) {
		this.next = validator;
	}
}