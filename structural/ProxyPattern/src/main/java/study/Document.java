package study;

import java.util.Arrays;

public class Document implements Writable {

	private String[] lines = new String[0];
	private int idx = 0;

	public Document() {
	}

	public String getLine(int lineNum) {
		return lines[lineNum];
	}

	@Override
	public String[] getLines() {
		return lines;
	}

	public void modified(int lineNum, String modified) {
		lines[lineNum] = modified;
	}

	@Override
	public void write(String... newLines) {
		lines = Arrays.copyOf(lines, lines.length + newLines.length);
		for (String newLine : newLines) {
			lines[idx++] = newLine;
		}
	}

	@Override
	public void print() {
		for (String line : lines) {
			System.out.println(line);
		}
	}

	@Override
	public void save() {
		System.out.println("저장중...");
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("저장 완료!");
	}
}