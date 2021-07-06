package study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {

	private static Map<String, List<Row>> tables = new HashMap<>();

	static {
		List<Row> list = new ArrayList<>();
		list.add(new Row("John", "Doe"));
		list.add(new Row("Jan", "Kowalski"));
		list.add(new Row("Dominic", "Doom"));

		tables.put("people", list);
	}

	private String table;
	private String column;

	/**
	 * 결과 값에 표시할 열의 인덱스 값.
	 *
	 * 다음 메소드로 값을 결정함 {@link #setColumnMapper()}
	 */
	private int colIndex = -1;

	/**
	 * 기본 설정으로 다음으로 오는 쿼리문에 대해 컨텍스트를 지우는데 사용함.
	 *
	 * See {@link Context#clear()}
	 */
	private static final Predicate<String> matchAnyString = s -> s.length() > 0;
	private static final Function<String, Stream<? extends String>> matchAllColumns = Stream::of;
	/**
	 * 하위 클래스의 설정에 따름 {@link Expression}
	 */
	private Predicate<String> whereFilter = matchAnyString;
	private Function<String, Stream<? extends String>> columnMapper = matchAllColumns;

	void setColumn(String column) {
		this.column = column;
		setColumnMapper();
	}

	void setTable(String table) {
		this.table = table;
	}

	void setFilter(Predicate<String> filter) {
		whereFilter = filter;
	}

	/**
	 * 컨텍스의 값을 기본 값으로 설정
	 *
	 * 필터 없이, 컬럼은 모두
	 */
	void clear() {
		column = "";
		columnMapper = matchAllColumns;
		whereFilter = matchAnyString;
	}

	List<String> search() {

		List<String> result = tables.entrySet()
			.stream()
			.filter(entry -> entry.getKey().equalsIgnoreCase(table))
			.flatMap(entry -> Stream.of(entry.getValue()))
			.flatMap(Collection::stream)
			.map(Row::toString)
			.flatMap(columnMapper)
			.filter(whereFilter)
			.collect(Collectors.toList());

		clear();

		return result;
	}

	/**
	 * 컬럼 매핑에 따라 {@link #column} 속성값을 설정
	 */
	private void setColumnMapper() {
		switch (column) {
			case "*":
				colIndex = -1;
				break;
			case "name":
				colIndex = 0;
				break;
			case "surname":
				colIndex = 1;
				break;
		}
		if (colIndex != -1) {
			columnMapper = s -> Stream.of(s.split(" ")[colIndex]);
		}
	}
}