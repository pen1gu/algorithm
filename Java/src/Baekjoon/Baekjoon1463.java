package baekjoon;

import java.util.Scanner;

public class Baekjoon1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n < 100) {
			System.out.println(n);//100 보다 작은 수는 다 한수
		} else {
			int result = 99;// 100 보다 클 때 100밑은 다 한수이므로 99부터 시작

			for (int i = 100; i <= n; ++i) {
				result += checkHanNumber(i);//한수 인지 체크하고 result에 더하기 
			}

			if (n == 1000)//1000은 제외
				result--;

			System.out.println(result);
		}
	}

	private static int checkHanNumber(int number) {
		int num1 = number / 100 % 10;
		int num2 = number / 10 % 10;
		int num3 = number % 10;

		if (num2 * 2 == num1 + num3) {
			return 1;
		}
		return 0;
	}
}