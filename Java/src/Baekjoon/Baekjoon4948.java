package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon4948 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input;
        while (true) {
            input = Integer.parseInt(bufferedReader.readLine());
            if (input == 0) break;
            System.out.println(getPrimeNumber(input, input * 2));
        }
        bufferedReader.close();
    }

    public static Integer getPrimeNumber(int num, int num_pow) {
        int cnt = 0;
        boolean[] data = new boolean[num_pow + 1];
        data[0] = false;
        data[1] = false;
        for (int i = 2; i <= num_pow; i++) {
            data[i] = true;
        }
        for (int i = 2; i <= num_pow; i++) {
            for (int j = 2; j * i <= num_pow; j++) {
                data[j * i] = false;
            }
        }
        for (int i = num + 1; i < data.length; i++) {
            if (data[i] == true) {
                cnt++;
            }
        }
        return cnt;
    }
}
