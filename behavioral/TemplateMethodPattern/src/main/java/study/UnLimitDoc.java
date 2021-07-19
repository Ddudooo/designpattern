package study;

import java.util.Arrays;

public class UnLimitDoc extends Document {

	@Override
	public void write(String newLine) {
		System.out.println("크기 제한 없이 새로운 내용을 작성합니다.");

		int strLen = this.getStrings().length;
		strings = Arrays.copyOf(this.getStrings(), strLen + 1);
		strings[strLen] = newLine;
	}
}