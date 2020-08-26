package Baekjoon;

import java.util.Scanner;

public class Baekjoon2875 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt();

        int max = n / 2 < m ? n / 2 : m;
        k -= n + m - max * 3; //

        while (k > 0) {
            k -= 3;
            max--;
        }
        System.out.println(max);
        scanner.close();
    }
}
