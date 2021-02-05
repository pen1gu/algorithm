package baekjoon;

import java.util.Scanner;

public class Baekjoon1436 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            int cnt = 0;
            int idx = 666;
            while (true) {
                if (String.valueOf(idx).contains("666")) {
                    cnt++;
                    if (cnt == num) {
                        System.out.println(idx);
                        break;
                    }
                }
                idx++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
