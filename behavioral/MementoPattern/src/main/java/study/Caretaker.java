package study;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	private List<Memento> memories = new ArrayList<>();

	public void save(Memento memento) {
		System.out.println("스냅샷을 저장합니다! " + memento);
		memories.add(memento);
	}

	public Memento undo() {
		System.out.println("최근 저장된 스냅샷으로 돌립니다!");
		return memories.remove(memories.size() - 1);
	}
}