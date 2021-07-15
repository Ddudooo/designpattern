package study;

import study.colleague.Colleague;
import study.colleague.ConcreateColleague1;
import study.colleague.ConcreateColleague2;
import study.mediator.ConcreateMediator;
import study.mediator.Mediator;

public class Application {

	public static void main(String[] args) {
		Colleague colleague1 = new ConcreateColleague1();
		Colleague colleague2 = new ConcreateColleague2();

		Mediator mediator = new ConcreateMediator(colleague1, colleague2);
		mediator.isEnable();
	}
}