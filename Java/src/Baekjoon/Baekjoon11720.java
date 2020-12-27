package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11720 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = toInt(bf.readLine());
		int result = 0;
		
		String[] arr = bf.readLine().split(""); 
		bf.close();

		for (int i = 0; i < n; i++) {
			result += toInt(arr[i]);
		}
		
		System.out.println(result);
	}
	
	public static int toInt(String s) {
		return Integer.parseInt(s);
	}
}
