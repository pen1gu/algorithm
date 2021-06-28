package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon10816 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Integer[] a_list = new Integer[N];

        for (int i = 0; i < N; i++) {
            a_list[i] = scanner.nextInt();
        }

        int K = scanner.nextInt();
        Integer[] b_list = new Integer[K];

        for (int i = 0; i < K; i++) {
            b_list[i] = scanner.nextInt();
        }

        Arrays.sort(a_list);
        for (int i = 0; i < N; i++) {
            System.out.print(a_list[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < K; i++) {
            System.out.print((upperBound(a_list, b_list[i]) - Arrays.binarySearch(a_list, b_list[i]) + 1) + " ");
        }

    }

    public static int upperBound(Integer[] array, int value) {
        int low = 0;
        int high = array.length;
        while (low < high) {
            final int mid = low + (high - low) / 2;
            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}

