package baekjoon;

import java.util.Scanner;

public class Baekjoon2748 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long num0 = 0,num1 = 1,num2 = 0;

        if (n == 0) System.out.println(num0);
        else if (n == 1) System.out.println(num1);
        else {
            for (int i = 1; i < n; i++) {
                num2 = num0 + num1;
                num0 = num1;
                num1 = num2;
            }
            System.out.print(num2);
        }
        scanner.close();
    }
}