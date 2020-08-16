package Baekjoon;

import java.util.Scanner;

public class Baekjoon4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long x, y, z;
        String print_text = "";

        while (true) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();

            if (x == 0 && y == 0 && z == 0) break;

            if ((z * z) == (y * y) + (x * x)) {
                print_text = "right";
            } else if ((x * x) == (y * y) + (z * z)) {
                print_text = "right";
            } else if ((y * y) == (x * x) + (z * z)) {
                print_text = "right";
            } else {
                print_text = "wrong";
            }
            System.out.println(print_text);
        }
        scanner.close();
    }
}
