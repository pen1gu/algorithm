package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2941 {
//	public static void main(String[] args) throws Exception {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String input = bf.readLine();
//		bf.close();
//		int cnt = 0;
//
//		for (int i = 0; i < input.length(); i++) {
//			char c = input.charAt(i);
//
//			if (c == '=' || c == '-') {
//				if (input.charAt(i - 1) == 'z' && input.charAt(i - 2) == 'd') {
//					cnt -= 2;
//				} else if (input.charAt(i - 1) == 'c' || input.charAt(i - 1) == 'd' || input.charAt(i - 1) == 's'
//						|| input.charAt(i - 1) == 'z') {
//					cnt--;
//				}
//			} else if (c == 'j') {
//				if (input.charAt(i - 1) == 'l' || input.charAt(i - 1) == 'n') {
//					cnt--;
//				}
//			}
//			cnt++;
//		}
//		
//		System.out.println(cnt);
//	}
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine().trim();
		bf.close();

		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			if (input.contains(arr[i])) {
				input = input.replaceAll(arr[i], " ");
			}
		}
		System.out.println(input.length());
	}
}
