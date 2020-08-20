package Baekjoon;

import java.util.Scanner;

public class Baekjoon2747 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fibo(scanner.nextInt()));
        scanner.close();
    }

    public static long fibo(long n) {
        fiboDpArray = new int[fiboCnt + 1];

        fiboDpArray[0] = 0;
        fiboDpArray[1] = 1;

        if (fiboCnt > 1) {
            for (int i = 2; i <= fiboCnt; i++) {
                fiboDpArray[i] = fiboDpArray[i - 2] + fiboDpArray[i - 1];
            }
        }

        return fiboDpArray[fiboCnt];
    }
}
