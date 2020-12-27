package baekjoon;

import java.util.Scanner;

public class Baekjoon2588 {

	static Scanner sc = new Scanner(System.in);

	static int a = sc.nextInt();
	static int b = sc.nextInt();

	public static void main(String[] args) {
		multiple(b);
		System.out.println(a * b);
	}

	private static void multiple(int n) {
		System.out.println(n % 10 * a);
		if (n / 10 > 0)
			 multiple(n / 10);
	}

}