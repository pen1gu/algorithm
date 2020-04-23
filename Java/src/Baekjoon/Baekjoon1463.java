package Baekjoon;

import java.util.Scanner;

public class Baekjoon1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] min = new int[1000001];
		min[1] = 0;

		for (int i = 2; i < n + 1; i++) {
			min[i] = min[i - 1] + 1;
			if (i % 2 == 0 && min[i / 2] + 1 < min[i]) {
				min[i] = min[i / 2] + 1;
			}
			if (i % 3 == 0 && min[i / 3] + 1 < min[i]) {
				min[i] = min[i / 3] + 1;
			}
		}
		System.out.println(min[n]);
	}

}
