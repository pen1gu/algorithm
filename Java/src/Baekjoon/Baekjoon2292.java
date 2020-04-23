package Baekjoon;

import java.util.Scanner;

public class Baekjoon2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int cnt = 2;
		for (int i = 1; i <= 5; i++) {
			input -= 6 * i;
			if (input<= 1) {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
