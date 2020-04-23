package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon5622 {
	public static int time;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] num = bf.readLine().toCharArray();//char 배열로 변경
		bf.close();
		for (char c : num) {
			time += (c - 'A') / 3 + 3;// 처음 에 2로 시작하기에 3을 더해준다.
			if (c=='S' || c=='V' || c=='Y' || c=='Z') {//마지막 7,8,9 숫자가 다른 숫자와는 다른 패턴을 가졌기에 밀린 알파벳은 제거
				time--;
			}
		}
		System.out.println(time);
	}
}
