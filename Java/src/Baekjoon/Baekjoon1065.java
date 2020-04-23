package Baekjoon;

import java.util.Scanner;

public class Baekjoon1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n < 100) {
			System.out.println(n);
		} else {
			int result = 99;

			for (int i = 100; i <= n; ++i) {
				result += check(i);
			}

			if (n == 1000)
				result--;

			System.out.println(result);
		}
	}

	private static int check(int n) {
		int n1 = n / 100 % 10;
		int n2 = n / 10 % 10;
		int n3 = n % 10;

		if (n2 * 2 == n1 + n3) {
			return 1;
		}
		return 0;
	}
}