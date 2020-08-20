package Baekjoon;

import java.util.Scanner;

public class Baekjoon1188 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        scanner.close();
        System.out.print(m - gcd(n, m));
    }
    public static int gcd(int n, int m) {
        if (m == 0) return n;
        return gcd(m, n % m);
    }
}
