package baekjoon;

import java.util.Scanner;

public class Baekjoon1018 {

    static boolean[][] arr;
    static int min = 64; // 칸 전체 개수

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        arr = new boolean[N][M];

        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine().trim();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W')
                    arr[i][j] = true;
                else
                    arr[i][j] = false;
            }
        }
        int row = N - 7;
        int column = M - 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y) {
        int endX = x + 8;
        int endY = y + 8;

        int count = 0;
        boolean TF = arr[x][y];

        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {
                if (arr[i][j] != TF) {
                    count++;
                }

                TF = (!TF);//현재 바꿀 바둑돌
            }
            TF = !TF; // 다음 줄의 돌의 색은 이전 줄의 마지막과 같다.
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}
