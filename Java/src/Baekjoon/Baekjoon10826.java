package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Baekjoon10826 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        BigInteger[] data = new BigInteger[N + 5];
        data[0] = BigInteger.valueOf(0);
        data[1] = BigInteger.valueOf(1);

        for (int i = 2; i <= N; i++) {
            data[i] = data[i - 1].add(data[i - 2]);
        }

        bufferedWriter.write(data[N] + "");
        bufferedReader.close();
        bufferedWriter.flush();
    }
}