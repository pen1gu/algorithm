package Baekjoon;

import java.util.Scanner;

public class Baekjoon2742 {

	Baekjoon2742(){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			System.out.println(i);
		}
		sc.close();
	}

	public static void main(String[] args) {
		new Baekjoon2742();
	}
}
