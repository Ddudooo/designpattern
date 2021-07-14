package study;

public interface Bundle<T> {

	public void add(T t);

	public Cashier<T> iterate();

	public int getSize();

	public T getAt(int idx);
}
