package study.colleague;

import study.mediator.Mediator;

public interface Colleague {

	public abstract void setMediator(Mediator mediator);

	public abstract void setColleague(boolean enable);

	public abstract boolean isEnable();

}
