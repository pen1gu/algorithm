package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = toInt(bf.readLine());

		StringTokenizer st = new StringTokenizer(bf.readLine());
		int cnt = 0;

		int result = 0;
		for (int i = 0; i < n; i++) {
			cnt = 0;
			int r = toInt(st.nextToken());
			for (int j = 2; j <= r; j++) {
				if (r % j == 0) {
					cnt++;
				}
			}
			if (cnt == 1) {
				result++;
			}
		}
		bf.close();
		System.out.println(result);
	}

	public static int toInt(String s) {
		return Integer.parseInt(s);
	}
}
