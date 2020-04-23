package Baekjoon;

import java.util.Scanner;

public class Baekjoon10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			if (a < 40) {
				a = 40;
			}
			result += a;
		}
		System.out.println(result / 5);
		sc.close();
	}
}
