package codeforces.CF1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();


        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();

            if (value == 2) {
                System.out.println("0 1");
                continue;
            } else if (value == 1) {
                System.out.println("1 0");
                continue;
            } else if (value == 0) {
                System.out.println("0 0");
                continue;
            }

            int half3Value = value / 3;
            int resultValue = value % half3Value;
            if (half3Value <= 1) {
                resultValue = value % 3;
            }


            int b1_add = resultValue == 1 ? 1 : 0;
            int b2_add = resultValue == 2 ? 1 : 0;

            int burles1 = Math.abs(half3Value + b1_add);
            int burles2 = Math.abs(half3Value + b2_add);

            System.out.println(burles1 + " " + burles2);
        }

        scanner.close();
    }
}
