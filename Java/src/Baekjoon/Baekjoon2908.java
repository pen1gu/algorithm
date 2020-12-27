package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2908 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = bf.readLine().split(" ");
		String[] data = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			data[i] = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				data[i] += arr[i].charAt(j);
			}
		}
		if (Integer.parseInt(data[0]) > Integer.parseInt(data[1])) {
			System.out.println(data[0]);
		} else {
			System.out.println(data[1]);
		}
	}
}
