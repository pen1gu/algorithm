package Baekjoon;

import java.util.Scanner;

public class Baekjoon1233 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int input = scanner.nextInt();
		
		int number = 3942387;
		number = switch (input) {
		case 1,2 -> {
			yield 1;
		}
		default -> number;
		};
		
		System.out.println(number);
	}
}
