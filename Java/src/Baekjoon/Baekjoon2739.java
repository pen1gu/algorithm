package baekjoon;

import java.util.Scanner;

public class Baekjoon2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= 9;i++) {
			System.out.println(String.format("%d * %d = %d", n,i,n*i));
		}
		sc.close();
	}
}
