package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int result = 0;
		int cnt = 0;
		String[] arr = {};
		int n = Integer.parseInt(s);
		String[] l = new String[n+1];
		for (int i = 0; i < n; i++) {
			cnt = 0;
			result = 0;
			l[i] = bf.readLine();
			for (int j = 0; j < l[i].length(); j++) {
				if (l[i].charAt(j)=='O') {
					cnt++;
				} else {
					cnt = 0;
				}
				result += cnt;
			}
			System.out.println(result);
		}
	}
}
