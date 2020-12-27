package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1157 {
	public static void main(String args[]) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();
		bf.close();

		str = str.toUpperCase();

		int[] arr = new int[26];
		int max = Integer.MIN_VALUE;
		int index = 0;

		for (int i = 0; i < str.length(); i++) {
			int value = str.charAt(i);
			arr[value - 65]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i + 65;
			} else if (max == arr[i]) {
				index = '?';
			}
		}

		System.out.println((char) index);
	}
}