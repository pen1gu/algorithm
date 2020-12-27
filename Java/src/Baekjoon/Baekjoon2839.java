package baekjoon;

import java.util.Scanner;

public class Baekjoon2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		if (n % 5 == 0) {
			System.out.println(n / 5);
			return;
		} else {
			int q = n / 5;
			for (int i = q; i > 0; i--) {
				int temp = n - (i * 5);
				if (temp % 3 == 0) {
					System.out.println(i + (temp / 3));
					return;
				}
			}
		}
		if (n % 3 == 0) {
			System.out.println(n / 3);
		} else {
			System.out.println(-1);
		}
		return;
	}
}
