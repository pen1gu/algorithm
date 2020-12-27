package baekjoon;

import java.util.Scanner;

public class Baekjoon11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(String.format("Case #%d: %d", i,a+b));
		}
		sc.close();
	}
}
