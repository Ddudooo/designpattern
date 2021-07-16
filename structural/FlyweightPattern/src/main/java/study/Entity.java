package study;

import java.util.Arrays;
import java.util.StringJoiner;

public class Entity {

	private SomeThing[] someThings;

	public Entity(String... strings) {
		this.someThings = new SomeThing[strings.length];
		Factory factory = Factory.getInstance();
		int idx = 0;
		for (String str : strings) {
			someThings[idx++] = factory.getSomeThing(str);
		}
	}

	@Override
	public String toString() {
		return new StringJoiner(" ", Entity.class.getSimpleName() + "[", "]")
			.add("someThings=" + Arrays.toString(someThings))
			.toString();
	}
}