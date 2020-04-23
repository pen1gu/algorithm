package Baekjoon;

import java.util.Scanner;

public class Baekjoon11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int ar = s.length()/10;
		int l;
		for (int i = 0; i <= s.length() / 10;i ++) {
			if (i == ar) {
				l = s.length();
				System.out.println(s.substring(l));
			}else {
				System.out.println(s.substring(i,i + 10));
			}
		}
	}
}
