package study;

import java.util.Arrays;

public class DocumentProxy implements Writable {

	private String[] temp = new String[0];
	private int idx = 0;
	private Document real;

	public DocumentProxy() {
	}

	public DocumentProxy(Document real) {
		this.real = real;
	}

	public Document getReal() {
		return real;
	}

	public void setReal(Document real) {
		this.real = real;
	}

	@Override
	public String[] getLines() {
		return temp;
	}

	@Override
	public void write(String... newLines) {
		temp = Arrays.copyOf(temp, temp.length + newLines.length);
		for (String newLine : newLines) {
			temp[idx++] = newLine;
		}
	}

	@Override
	public void print() {
		for (String line : temp) {
			System.out.println(line);
		}
	}

	@Override
	public void save() {
		System.out.println("저장시에는 실제 객체를 호출한다.");
		real.write(temp);
		real.save();
	}
}