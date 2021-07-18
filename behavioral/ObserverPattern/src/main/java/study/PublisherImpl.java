package study;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher {

	private final List<Observer> subscribers = new ArrayList<>();
	private String data = "";

	@Override
	public void subscribe(Observer observer) {
		System.out.println("관찰중... " + observer);
		subscribers.add(observer);
	}

	@Override
	public void unSubscribe(Observer observer) {
		System.out.println("관찰중단... " + observer);
		subscribers.remove(observer);
	}

	@Override
	public void notifying() {
		System.out.println("변경 발생!");
		for (Observer observer : subscribers) {
			observer.notice(this);
		}
	}

	@Override
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}
}