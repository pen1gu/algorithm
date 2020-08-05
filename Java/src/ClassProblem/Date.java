package ClassProblem;

public class Date {
	private int year;
	private String month;
	private int day;
	
	public Date(int year, String month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	void print2() {
		System.out.println(String.format("%s %d, %d", month, day, year));
	}
}
