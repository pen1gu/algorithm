package alogrithm_skills;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String binary = Integer.toBinaryString(input);

        scanner.close();
        for (int i = 0; i < 32; i++) {
            System.out.print("0");
            if (32-binary.length() == i){
                System.out.println(binary);
                return;
            }
        }
    }
}
