package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10833 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = toInt(bf.readLine());
		int result = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine()," ");
			int a = toInt(st.nextToken());
			int b = toInt(st.nextToken());
			result += b % a;
		}
		bf.close();
		System.out.println(result);
	}
	
	public static int toInt(String s) {
		return Integer.parseInt(s);
	}
}
