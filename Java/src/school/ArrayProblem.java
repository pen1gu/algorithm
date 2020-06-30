package school;

import java.util.Scanner;

public class ArrayProblem {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("사람 수:");
		int input = scanner.nextInt();

		System.out.println("점수를 입력하세요.");
		int result = 0, max = -987643, min = 98765545;
		for (int i = 0; i < input; i++) {
			System.out.print((i + 1) + "번의 점수 : ");
			int score = scanner.nextInt();
			result += score;
			if (max < score) {
				max = score;
			}
			if (min > score) {
				min = score;
			}
		}

		System.out.println("합계는 " + result + "점입니다.");
		System.out.println("평균은 " + (float) (result / input) + "점입니다.");
		System.out.println("최고점은 " + max + "점입니다.");
		System.out.println("최저점은 " + min + "점입니다.");
	}
}
