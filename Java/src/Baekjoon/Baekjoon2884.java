package baekjoon;

import java.util.Scanner;

public class Baekjoon2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < 0 || a > 23 || b > 60 || b < 0) {
			return;
		}
		
		
		int time = b;
		time -= 45;
		
		if (time < 0) {
			b = 60 - (45 - b);
			a--;
			if (a < 0) {
				a = 23;
			}
		}else {
			b -= 45;
		}
		
		System.out.println(a+" "+b);
		sc.close();
	}
}
