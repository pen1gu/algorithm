package baekjoon;

import java.util.Scanner;

public class Baekjoon1193 {

    public void solution(int input) {
        int crossCount = 1; // 위치한 곳의 대각선 개수
        int prevCountSum = 0; // 현재까지 칸의 누적 수

        while (true) {
            if (input <= prevCountSum + crossCount) {
                if (crossCount % 2 == 1) {
                    System.out.println((crossCount - (input - prevCountSum - 1) + "/" + (input - prevCountSum)));
                    break;
                } else {
                    System.out.println((crossCount - (input - prevCountSum - 1) + "/" + (input - prevCountSum)));
                    break;
                }
            } else {
                prevCountSum += crossCount;
                crossCount++;
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        Baekjoon1193 b = new Baekjoon1193();
        b.solution(input);
    }


}
