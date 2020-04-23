package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			String[] temp = bf.readLine().split(" ");
			bw.write(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]) + "\n");
		}
		bw.flush();
	}
}
