package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2749 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        int pisano_num = 1500000;
        long[] arr = new long[pisano_num];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < pisano_num && i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000;
        }

        if (n >= pisano_num) {
            n %= pisano_num;
        }

        System.out.println(arr[(int) n]);
        bufferedReader.close();
    }
}
