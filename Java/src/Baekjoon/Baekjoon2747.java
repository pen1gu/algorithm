package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Baekjoon2747 {
    static double[] data;
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();
        data = new double[n + 1];
        System.out.printf("%.0f",fibo(n));
    }
    public static double fibo(int n){
        if (n==0) return 0;
        if (n <= 2) return 1;
        if (data[n] == 0) data[n] = fibo(n-1) + fibo(n-2);
        return data[n];
    }
}