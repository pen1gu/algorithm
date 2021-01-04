package baekjoon;

import java.util.Scanner;

public class Baekjoon1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" world!");

        stringBuilder.delete(0, stringBuilder.length());

        for (int i = 0; i < N; i++) {
            int user1_x = scanner.nextInt(), user1_y = scanner.nextInt(), user1_r = scanner.nextInt();
            int user2_x = scanner.nextInt(), user2_y = scanner.nextInt(), user2_r = scanner.nextInt();

        }
    }
}
