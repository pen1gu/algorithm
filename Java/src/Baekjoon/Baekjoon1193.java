package baekjoon;

import java.util.Scanner;

public class Baekjoon1193 {

    public void solution(int input) {
        int crossCount = 1; // ��ġ�� ���� �밢�� ����
        int prevCountSum = 0; // ������� ĭ�� ���� ��

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
