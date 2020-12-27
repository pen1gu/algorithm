package baekjoon;

import java.util.Scanner;

public class Baekjoon1450 {

    static int items[][];
    static int dp[][];
    static int cnt = 1;
    final static int WEIGHT = 0;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int C = scanner.nextInt();

        items = new int[N][1];
        dp = new int[N][C + 1];

        for (int i = 0; i < N; i++) {
            items[i][WEIGHT] = scanner.nextInt();
            dp[i][WEIGHT] = -1;
        }
        knapsack(0, C);
        System.out.println(cnt);
        scanner.close();
    }

    static int knapsack(int index, int C) {
        if (index == N) return 0;

        int ret = dp[index][WEIGHT]; // ret 변수에
        if (ret != -1) {
            return ret;
        }

        if (items[index][WEIGHT] <= C) {
            ret = knapsack(index + 1, C - items[index][WEIGHT]);
        }
        ret = MAX(ret, knapsack(index + 1, C));
        cnt++;
        return dp[index][C] = ret;
    }

    public static Integer MAX(int a, int b) {
        return a > b ? a : b;
    }
}
