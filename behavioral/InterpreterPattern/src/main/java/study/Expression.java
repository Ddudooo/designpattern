package study;

import java.util.List;

public interface Expression {

	List<String> interpret(Context context);
}