package Baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon2562 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int max = -87654321;
		int index = 0;
		int[] list = new int[9];
		for (int i = 0; i < 9; i++) {
			list[i] = sc.nextInt();
			if (max < list[i]) {
				max = list[i];
				index = i;
			}
		}

		System.out.println(max);
		System.out.println(index + 1);
	}

}
