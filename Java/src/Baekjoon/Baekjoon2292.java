package baekjoon;

import java.util.Scanner;

public class Baekjoon2292 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		System.out.println(solution_beehouse(input));
	}

	public static int solution_beehouse(int n) {
		if (n == 1)
			return 1;
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result += (i - 1) * 6;
			if (n <= result)
				break;
		}
		return result;
	}
}