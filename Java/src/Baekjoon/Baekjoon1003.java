package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1003 {

    static BufferedReader bf;

    public static void main(String[] args) throws NumberFormatException, IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(bf.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(bf.readLine());

            int[][] arr = new int[n + 1][2];

            if (n == 0) {
                System.out.println("1 0");
                continue;
            }

            if (n == 1) {
                System.out.println("0 1");
                continue;
            }

            arr[0][0] = 1;
            arr[1][1] = 1;

            for (int j = 2; j <= n; j++) {
                arr[i][0] = arr[j - 1][0] + arr[j - 2][0];
                arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
            }

            System.out.println(arr[n][0] + " " + arr[n][1]);
        }
    }
}
