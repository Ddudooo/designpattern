package study.mediator;

import study.colleague.Colleague;

public class ConcreateMediator implements Mediator {

	private boolean enable;
	private Colleague colleague1;
	private Colleague colleague2;

	public ConcreateMediator(Colleague colleague1,
		Colleague colleague2) {
		this.colleague1 = colleague1;
		this.colleague2 = colleague2;
	}

	@Override
	public void colleagueChanged() {
		colleague1.setColleague(false);
		colleague2.setColleague(false);
	}

	public boolean isEnable() {
		return colleague1.isEnable() && colleague2.isEnable();
	}
}