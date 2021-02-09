package baekjoon;

import java.util.Scanner;

public class Baekjoon2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), M = scanner.nextInt();

        int gcd = gcd(N, M);
        System.out.println(gcd);
        System.out.println(N * M / gcd);

        scanner.close();
    }

    static int gcd(int n1, int n2) {
        if (n2 == 0) return n1;
        else return gcd(n2, n1 % n2);
    }
}
