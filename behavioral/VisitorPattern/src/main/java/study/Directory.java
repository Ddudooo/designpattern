package study;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Element {

	private String name;
	private List<Element> subElement = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Element> getSubElement() {
		return subElement;
	}

	public void add(Element element) {
		subElement.add(element);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}