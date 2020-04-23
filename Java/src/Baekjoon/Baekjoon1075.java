package Baekjoon;

import java.util.Scanner;

public class Baekjoon1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int f = sc.nextInt();
		
		int sub = n - (n%100); 
		
		if (n < 100) {
			sub += f;
		}else {
			while(sub % f != 0) {
				sub++;
			}
		}
		
		if (sub % 100 < 10) {
			System.out.println("0" + sub % 100);
			return;
		}
		System.out.println(sub % 100);
	}
}
