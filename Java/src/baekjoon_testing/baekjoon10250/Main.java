package baekjoon_testing.baekjoon10250;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int H = scanner.nextInt(); // È£ÅÚÀÇ Ãþ ¼ö
            int W = scanner.nextInt(); // °¢ ÃþÀÇ ¹æ ¼ö
            int N = scanner.nextInt(); // ¸î ¹øÂ° ¼Õ´Ô

            if (N % H == 0) {
                System.out.println((H * 100) + (N / H));
            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
        scanner.close();
    }
}
