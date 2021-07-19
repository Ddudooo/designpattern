package study;

public class LimitDoc extends Document {

	private int idx = 0;

	public LimitDoc() {
		super();
		strings = new String[10];
	}

	@Override
	public void write(String newLine) {
		if (idx >= 10) {
			System.out.println("더이상 작성할 수 없습니다");
			return;
		}
		System.out.println("제한된 크기에 새로운 내용을 작성합니다.");
		strings[idx++] = newLine;
	}
}