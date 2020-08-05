package ClassProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] word = bufferedReader.readLine().split("");
		bufferedReader.close();

		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i]);
		}
	}
}
