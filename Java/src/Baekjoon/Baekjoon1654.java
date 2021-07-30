package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1654 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int k = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(arr);

        long start = 1;
        long end = arr[arr.length - 1];
        while (start <= end) {
            long middle = (start + end) / 2;
            long sum = 0;
            for (int i = 0; i < k; i++) {
                sum += arr[i] / middle;
            }
            if (sum >= n) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.println(end);

    }
}
