package Baekjoon;

import java.util.Scanner;

public class Baekjoon10870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(input));
    }

    public static int fibonacci(int input) {
        if (input == 0) {
            return 0;
        }
        if (input <= 2) {
            return 1;
        }
        return fibonacci(input - 1) + fibonacci(input - 2);
    }
}
