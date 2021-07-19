package baekjoon;

import java.util.Scanner;

public class Baekjoon11050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int binaryCoefficient = 0;
        int NCnt = 1;
        int KCnt = 1;

        for (int i = N; i > N - K; i--) {
            NCnt *= i;
        }

        for (int i = 1; i <= N - (N - K); i++) {
            KCnt *= i;
        }

        binaryCoefficient = NCnt / KCnt;

        System.out.println(binaryCoefficient);
    }
}

// 5C3 = 5 * 4 * 3 / 3 * 2 * 1