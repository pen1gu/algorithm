package baekjoon;

import java.util.Scanner;

public class Baekjoon2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int input_length = String.valueOf(input).length();
        int min_value = input - (input_length * 9);
        int result = 0;

        for (int i = min_value; i < input; i++) {
            int sum = i;
            int current_no = i;
            while (current_no > 0) {
                sum += current_no % 10;
                current_no /= 10;
            }
            if (sum == input) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
