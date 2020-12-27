package baekjoonseouluniv2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1 {
    static String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri"};
    static int sleepTime = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int T = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        for (int i = 0; i < N; i++) {
            String[] arr = bufferedReader.readLine().split(" ");
            getSleepTime(arr[0], Integer.parseInt(arr[1]), arr[2], Integer.parseInt(arr[3]));
        }
        System.out.println(T - sleepTime > 48 ? T - sleepTime : -1);
    }

    public static void getSleepTime(String dow1, int t1, String dow2, int t2) {
        int n = t1 > t2 ? t1 - t2 : t2 - t1;
        if (!dow1.equals(dow2)) n = 24 - n;
        sleepTime += n;
    }
}