package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5565 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Integer arr = 0;
		for (int i = 0; i < 9; i++) {
			arr += Integer.parseInt(bf.readLine());
		}
		System.out.println(n - arr);
		bf.close();
	}
}
