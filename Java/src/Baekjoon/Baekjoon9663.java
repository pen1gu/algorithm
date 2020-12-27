package Baekjoon;

import java.util.Scanner;

public class Baekjoon9663 {

    static int n;
    static int[] vx = new int[15 + 1];
    static int[] vy = new int[15 + 1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int r = 0;
        for (int i = 0; i < n; i++) {
            r += go(0, i);
        }
        System.out.println(r);
        scanner.close();
    }

    public static int go(int y, int x) {
        for (int i = 0; i < y; i++) {
            if (y == vy[i]) return 0;
            if (x == vx[i]) return 0;
            if (Math.abs(x - vx[i]) == Math.abs(y - vy[i])) return 0;
        }

        vy[y] = y;
        vx[y] = x;
        if (y == n - 1) return 1;

        int r = 0;
        for (int i = 0; i < n; i++) {
            r += go(y + 1, i);
        }

        return r;
    }
}
