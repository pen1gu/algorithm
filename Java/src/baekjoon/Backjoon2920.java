package baekjoon;

import java.util.Scanner;

public class Backjoon2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        int count = 0;

        for (int i = 1; i <= arr.length; i++) {
            if (arr[i - 1] == i) count++;


            if (count == 8) {
                System.out.println("ascending");
                return;
            }
        }

        count = 0;

        int descendingValue = 8;
        for (int i = 0; i < 8; i++) {
            if (arr[i] == descendingValue--) {
                count++;
            }
        }

        if (count == 8) {
            System.out.println("descending");
            return;
        }

        if (count != 8) {
            System.out.println("mixed");
        }

        scanner.close();
    }
}
