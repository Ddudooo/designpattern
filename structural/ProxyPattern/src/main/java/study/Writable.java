package study;

public interface Writable {

	public String[] getLines();

	public void write(String... newLines);

	public void print();

	public void save();
}
