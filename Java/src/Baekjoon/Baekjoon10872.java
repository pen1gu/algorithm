package Baekjoon;

import java.util.Scanner;

public class Baekjoon10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int ans =1;
		for (int i = 2; i <= n; i++) {
			ans *= i;
		}
		if (n==0) {
			ans=0;
		}
		System.out.println(ans);
	}
//	public static int fac(int n) {
//		if (n==0) {
//			return 0;
//		}else if (n==1) {
//			return 1;
//		}
//		return n * fac(n-1);
//	}
}
