package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon1316 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int cnt = n;
		
		for (int i = 0; i < n; i++) {
			String input = bf.readLine();
			boolean[] check = new boolean[26];
			
			for (int j = 1; j < input.length(); j++) {
				if (input.charAt(j-1) != input.charAt(j)) {
					if (check[input.charAt(j)-97]==true) {
						cnt--;
						break;
					}
					check[input.charAt(j-1)-97]= true;
				}
			}
		}
		System.out.println(cnt);
	}
}
