package Baekjoon;

import java.util.Scanner;

public class Baekjoon1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();

		int num = a;
		int cnt = 0;

		do {
			num = num % 10 * 10 + (num / 10 + num % 10) % 10;
			cnt++;
		} while (a != num);

		System.out.println(cnt);
	}
}
