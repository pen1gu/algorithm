package Baekjoon;

import java.util.Scanner;

public class Baekjoon10797 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cm = 0;
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			cm = sc.nextInt();
			if (n == cm) {
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}
}
