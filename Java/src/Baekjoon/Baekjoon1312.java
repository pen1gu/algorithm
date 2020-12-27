package baekjoon;

import java.util.Scanner;

public class Baekjoon1312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a%b;
		
		for (int i = 0; i < c-1; i++) {
			result *= 10;
			result %= b;
		}
		result *= 10;
		System.out.println(result/b);
	}
}
