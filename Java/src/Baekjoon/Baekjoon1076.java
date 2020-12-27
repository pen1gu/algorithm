package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String f = sc.next();
		String s = sc.next();
		String t = sc.next();
		sc.close();
		Long result;
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("black", "0,1");
		map.put("brown", "1,10");
		map.put("red", "2,100");
		map.put("orange", "3,1000");
		map.put("yellow", "4,10000");
		map.put("green", "5,100000");
		map.put("blue", "6,1000000");
		map.put("violet", "7,10000000");
		map.put("grey", "8,100000000");
		map.put("white", "9,1000000000");

		String[] get1 = map.get(f).split(",");
		String[] get2 = map.get(s).split(",");
		String[] get3 = map.get(t).split(",");
		
		result = Long.parseLong(get1[0] + get2[0]) * Long.parseLong(get3[1]);
		System.out.println(result);
	}
}
