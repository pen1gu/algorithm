package baekjoon;

import java.io.IOException;
import java.util.Scanner;


public class Baekjoon10952 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a ==0 && b==0) {
				return;
			}
			System.out.println(a+b);
		}
	}
}
