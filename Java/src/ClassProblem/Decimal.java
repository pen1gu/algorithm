package ClassProblem;

public class Decimal {
	private int number_actual;
	private int number_imagine;
	
	double i = Math.sqrt(-1);
	
	public Decimal(int number_actual, int number_imagine) {
		this.number_actual = number_actual;
		this.number_imagine = number_imagine;
	}
	
	void printDecimal() {
		System.out.println(number_actual+ number_imagine * i);
	}
	
	void printExpression() {
		System.out.println(String.format("%d + %d * i", number_actual, number_imagine));
	}
}
