package baekjoon;

import java.time.LocalTime;
import java.util.Scanner;

public class Baekjoon1408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] curTime = toInt(sc.next().split(":"));
		int[] startTime = toInt(sc.next().split(":"));
		sc.close();

		var t1 = LocalTime.of(curTime[0], curTime[1], curTime[2]);
		var t2 = LocalTime.of(startTime[0], startTime[1], startTime[2]);

		var result = t2.minusHours(t1.getHour()).minusMinutes(t1.getMinute()).minusSeconds(t1.getSecond());

		System.out.println(result);
	}

	public static int[] toInt(String[] s) {
		int[] n = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			n[i] = Integer.parseInt(s[i]);
		}
		return n;
	}
}
