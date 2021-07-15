package study.colleague;

import study.mediator.Mediator;

public class ConcreateColleague2 implements Colleague {

	private boolean enable;
	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleague(boolean enable) {
		this.enable = enable;
	}

	@Override
	public boolean isEnable() {
		return enable;
	}
}