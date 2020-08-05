package ClassProblem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Car car = new Car(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(),
				scanner.nextInt(), scanner.nextInt());
		
		car.showStatus();
		scanner.close();
 	}
}
