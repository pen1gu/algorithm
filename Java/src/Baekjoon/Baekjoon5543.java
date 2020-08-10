package Baekjoon;

import java.util.Scanner;

public class Baekjoon5543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min_burger = 98765432;
        int min_drink = 98765432;
        for (int i = 0; i < 5; i++) {
            if (i < 3) {
                int input_burger = scanner.nextInt();
                if (min_burger > input_burger) {
                    min_burger = input_burger;
                }
            }else{
                int input_drink = scanner.nextInt();
                if (min_drink > input_drink){
                    min_drink = input_drink;
                }
            }
        }
        scanner.close();
        System.out.println(min_burger + min_drink - 50);
    }
}
