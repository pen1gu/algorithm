package baekjoon;

import java.util.Scanner;

public class Baekjoon1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int j = 0; j < n; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int lf = 0;
			int result = 1;

			if (a % 10 == 0 || a % 10 == 1 || a % 10 == 5 || a % 10 == 6) {
				result = a % 10;
			} else if (a % 10 == 4 || a % 10 == 9) {
				lf = b % 2;
				if (lf == 0)
					lf = 2;
			} else {
				lf = b % 4;
				if (lf == 0)
					lf = 4;
			}

			for (int i = 0; i < lf; i++)
				result = (result * a) % 10;
			if (result == 0)
				result = 10;
			System.out.println(result);
		}
		sc.close();
		
	}

}
