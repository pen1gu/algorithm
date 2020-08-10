package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] input_arr = new int[N];
        for (int i = 0; i < N; i++) {
            input_arr[i] = scanner.nextInt();
        }
        scanner.close();
//        1. M이랑 같을 때 2. M 보다 작을 때 3. 정수
        int max = -987654321;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    int sum = input_arr[i] + input_arr[j] + input_arr[k];

                    if (i == j || j == k || i == k){
                        continue;
                    }

                    if (M >= sum){
                        if (sum > max){
                            max = sum;
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }
}
