package Baekjoon;

import java.util.Scanner;

public class Baekjoon5585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {500, 100, 50, 10, 5, 1};
        int input = 1000 - scanner.nextInt();
        int index = 0;
        int result = 0;
        scanner.close();

        while (input != 0) {
            int temp = input / array[index];
            input -= temp * array[index++];
            result += temp;
        }
        System.out.println(result);
    }
}
