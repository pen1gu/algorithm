package Baekjoon;

import java.util.Scanner;

public class Baekjoon4948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = -1;
        while (true) {
            input = scanner.nextInt();
            if (input == 0) break;
            System.out.println(check_prime_number(input, input * 2));
        }
    }

    public static Integer check_prime_number(int num, int num_pow) {
        int cnt = 0;
        boolean[] data = new boolean[num_pow + 1];

        data[0] = false;
        data[1] = false;

        for (int i = num + 1; i <= num_pow; i++) {
            data[i] = true;
        }

        for (int i = 2; i <= num_pow; i++) {
            for (int j = 2; i * j <= num_pow; j++) {
                data[i * j] = false;
            }
        }


        for (int i = num; i <= num_pow; i++) {
            if (data[i] == true) {
                cnt++;
            }
        }
        return cnt;
    }
}
