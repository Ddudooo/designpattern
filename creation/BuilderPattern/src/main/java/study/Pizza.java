package study;

//이펙티브 자바의 빌더 패턴
public class Pizza {

	private String topping;
	private String dough;
	private String cheese;

	public static class Builder {

		private String topping;
		private String dough;
		private String cheese;

		public Builder() {
		}

		public Builder topping(String topping) {
			this.topping = topping;
			return this;
		}

		public Builder dough(String dough) {
			this.dough = dough;
			return this;
		}

		public Builder cheese(String cheese) {
			this.cheese = cheese;
			return this;
		}

		public Pizza build() {
			return new Pizza(this);
		}
	}

	private Pizza(Builder builder) {
		this.topping = builder.topping;
		this.dough = builder.dough;
		this.cheese = builder.cheese;
	}

	@Override
	public String toString() {
		return "Pizza{" +
			"topping='" + topping + '\'' +
			", dough='" + dough + '\'' +
			", cheese='" + cheese + '\'' +
			'}';
	}
}