package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2309 {

    static final int MAX = 100;
    static final int SIZE = 9;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] input = new Integer[SIZE];
        int result = 0;

        for (int i = 0; i < SIZE; i++) {
            input[i] = Integer.parseInt(bufferedReader.readLine());
            result += input[i];
        }
        bufferedReader.close();

        boolean check = false;

        for (int i = 0; i < SIZE; i++) {
            for (int j = i + 1; j < SIZE; j++) {
                if (result - (input[i] + input[j]) == MAX) {
                    check = true;
                    input[i] = -1;
                    input[j] = -1;
                    break;
                }
                if (check) break;
            }
        }
        Arrays.sort(input);

        for (int output : input) if (output != -1) System.out.println(output);
    }
}
