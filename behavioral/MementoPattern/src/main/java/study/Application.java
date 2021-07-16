package study;

public class Application {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		caretaker.save(originator.createMemento());

		originator.setData("데이터 변경");
		caretaker.save(originator.createMemento());

		originator.migration(caretaker.undo());

		originator.setNum(50);
		caretaker.save(originator.createMemento());

		originator.setData("데이터 변경");
		caretaker.save(originator.createMemento());
	}
}