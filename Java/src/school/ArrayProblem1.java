package school;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayProblem1 {
	public static void main(String[] args) throws Exception {
		System.out.println("1~10사이의 숫자를 5개 입력하세요");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bufferedReader.readLine().split(" ");

		int cnt = 10;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < input.length; j++) {
				if (cnt > Integer.parseInt(input[j])) {
					System.out.print("   ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
			cnt--;
		}
		bufferedReader.close();
	}
}
