package baekjoon;

import java.util.Scanner;

public class Baekjoon1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max = -987654321, min = 987654321, num = 0;

        for (int i = 0; i < N; i++) {
            num = scanner.nextInt();
            if (max < num)
                max = num;
            if (min > num)
                min = num;

        }

        System.out.println(max * min);
        scanner.close();
    }
}
