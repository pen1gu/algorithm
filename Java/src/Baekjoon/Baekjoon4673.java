package baekjoon;

public class Baekjoon4673 {
	public static void main(String[] args) {

		boolean[] snum = new boolean[10001];
		for (int i = 1; i < 10000; ++i) {
			int result = toSnum(i);
			if (result <= 10000) {
				snum[result] = true;
			}
		}
		
		for (int i = 1; i < snum.length; ++i) {
			if (!snum[i]) {
				System.out.println(i);
			}
		}
	}

	public static int toSnum(int a) {
		int result = a;
		while (a > 0) {
			result += a % 10;
			a /= 10;
		}
		return result;
	}
}
