package baekjoon;

import java.util.Scanner;

public class Baekjoon10886 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int ycnt = 0, ncnt = 0;
        for (int i = 0; i < input; i++) {
            int input_cute = scanner.nextInt();
            if (input_cute == 0) ycnt++;
            else ncnt++;
        }
        scanner.close();
        System.out.println(ncnt > ycnt ? "Junhee is cute!" : "Junhee is not cute!");
    }
}
