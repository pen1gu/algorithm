package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int[] zeroCount = new int[41];
        int[] oneCount = new int[41];

        zeroCount[0] = 1;
        zeroCount[1] = 0;

        oneCount[0] = 0;
        oneCount[1] = 1;

        for (int j = 2; j < 41; j++) {
            zeroCount[j] = zeroCount[j - 1] + zeroCount[j - 2];
            oneCount[j] = oneCount[j - 1] + oneCount[j - 2];
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(zeroCount[arr[k]] + " " + oneCount[arr[k]]);
        }

        bufferedReader.close();
    }
}
