package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String sum;
		double n = Integer.parseInt(bf.readLine());
		double cnt = 0;
		double result = 0;
		int a;
		double[] list;
		try {
			for (int i = 0; i < n; i++) {
				cnt = 0;
				result = 0;
				sum = bf.readLine();
				st = new StringTokenizer(sum, " ");
				a = toInt(st.nextToken());
				list = new double[a];
				for (int j = 0; j < a; j++) {
					list[j] = toInt(st.nextToken());
					cnt += list[j];
					if (a - 1 == j) {
						cnt /= a;
						for (int j2 = 0; j2 < a; j2++) {
							if (list[j2] > cnt) {
								result++;
							}
						}
//						System.out.println(Math.round(((double)(result / (double)a) * 100) * 1000.000) / 1000.000  + "%");
						System.out.println(String.format("%.3f", (double)(result / (double)a) * 100) + "%");
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println("0.000%");
		}

	}

	public static Integer toInt(String s) {
		int a = Integer.parseInt(s);
		return a;
	}

}
