package baekjoon;

import java.util.Scanner;

public class Baekjoon14940 {
    static int[][] cost;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        cost = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] != 0) {
                    if (i > 0 && j > 0 && i + 1 < m && j + 1 < n) {
                        if (cost[i][j - 1] == 0 && cost[i][j + 1] == 0) {
                            insertCost(i, j, i - 1, j);
                            /*cost[i][j] = cost[i][j - 1] + 1;//좌우 양옆을 살펴 왼,오가 막혀 있다면 위 아래 계산. 뚤린 곳 + 1을 한다*/
                        }
                        if (cost[i - 1][j] == 0 && cost[i + 1][j] == 0) {
                            insertCost(i, j, i, j - 1);
                        }
                    }
                    cost[i][j] = i + j;
                } else {
                    cost[i][j] = 0;
                }
            }
        }

        // 일단 특정 위치까지의 거리를 찾아내는 알고리즘을 작성

        for (
                int i = 0;
                i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ", cost[i][j]);
            }
            System.out.println();
        }

    }

    public static void insertCost(int n, int m, int row, int col) {
        cost[n][m] = cost[col][row] + 1;
    }
}
