package myproject;

import java.util.Scanner;

public class ChangeBit_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt(), data = 0;
        for (int i = 31; i >= 0; i--) {
            data = (input >> i) & 1;
            System.out.print(data + " ");
        }
        scanner.close();
    }
}
