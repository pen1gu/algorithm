package baekjoon;

import java.util.Scanner;

public class Baekjoon10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        System.out.println(factorial(input));
    }

    public static int factorial(int input) {
        if (input == 0) {
            return 1;
        } else if (input == 1) {
            return 1;
        }
        return input * factorial(input - 1);
    }
}
