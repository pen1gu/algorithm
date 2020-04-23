package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] l = bf.readLine().split(" ");
        bf.close();
		int list[] = new int [n];
 		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(l[i]);
		}
		Arrays.sort(list);
		System.out.println(list[0]+" "+list[n-1]);
	}
}