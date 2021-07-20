package baekjoon;

import java.util.Scanner;

public class Baekjoon11721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        int cnt = 0;
        for (int i = 0; i < input.length() / 10 + 1; i++) {
            int index = (i + 1) * 10;
            System.out.println(input.substring(cnt, index > input.length() ? index - 10 + input.length() % 10 : index));
            cnt += 10;
        }

        scanner.close();
    }
}
