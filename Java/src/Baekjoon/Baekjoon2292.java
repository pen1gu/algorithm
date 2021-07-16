package baekjoon;

import java.util.Scanner;

public class Baekjoon2292 {

    public int solution(int n) {
        if (n == 1)
            return 1;

        int result = 1;
        int floorCount = 0;

        for (int i = 0; i < n; i++) { // 1 6 12 18 24, 1 7 19 37 61
            result += i * 6;
            floorCount++;

            if (n <= result)
                break;
        }
        return floorCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        Baekjoon2292 b = new Baekjoon2292();
        System.out.println(b.solution(input));
    }
}