package study;

public interface Publisher {

	public void subscribe(Observer observer);

	public void unSubscribe(Observer observer);

	public void notifying();

	public String getData();
}
