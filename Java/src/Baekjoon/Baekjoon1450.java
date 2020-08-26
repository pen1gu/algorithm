package Baekjoon;

import java.util.Scanner;

public class Baekjoon1450 {

    static int items[][];
    static int dp[][];
    static int weight = 0;
    static int V = 1;
    static int N = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        System.out.println(knapsack(0,capacity));
    }

    static int knapsack(int pos, int capacity) {
        if (pos == N) return 0;

        int ret = dp[pos][capacity];
        if (ret != -1) return ret;
        if (items[pos][weight] <= capacity)
            ret = knapsack(pos + 1, capacity - items[pos][weight])
                    + items[pos][V];
        ret = MAX(ret, knapsack(pos + 1, capacity));
        return dp[pos][capacity]=ret;
    }

    public static Integer MAX(int a, int b)    {
        return a > b ? a : b;
    }
}
