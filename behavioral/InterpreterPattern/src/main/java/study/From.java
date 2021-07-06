package study;

import java.util.List;

public class From implements Expression {

	private String table;
	private Where where;

	From(String table) {
		this.table = table;
	}

	From(String table, Where where) {
		this.table = table;
		this.where = where;
	}

	@Override
	public List<String> interpret(Context context) {
		context.setTable(table);
		if (where == null) {
			return context.search();
		}
		return where.interpret(context);
	}
}