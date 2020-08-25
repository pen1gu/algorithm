package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon1003 {
    BufferedReader bf;
    int zcnt = 0, ocnt = 0;

    Baekjoon1003() throws Exception {
        bf = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(bf.readLine());
        for (int i = 0; i < tc; i++) {
            zcnt = 0;
            ocnt = 0;
            int n = Integer.parseInt(bf.readLine());
            fibo(n);
            System.out.println(zcnt+" "+ocnt);
        }
        bf.close();
    }

    public static void main(String[] args) {
        try {
            new Baekjoon1003();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    int fibo(int n) {
        if (n == 0) {
            zcnt++;
            return 0;
        } else if (n == 1) {
            ocnt++;
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
