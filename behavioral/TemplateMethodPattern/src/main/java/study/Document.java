package study;

public abstract class Document {

	protected String[] strings = new String[0];

	public String[] getStrings() {
		return strings;
	}

	public abstract void write(String newLine);

	public void print() {
		for (String str : strings) {
			System.out.println(str);
		}
	}
}