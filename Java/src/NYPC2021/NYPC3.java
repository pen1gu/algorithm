package NYPC2021;

import java.util.Scanner;

public class NYPC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int F = scanner.nextInt();
        int N = scanner.nextInt();

        int currentFloor = 1;
        int usedElevator = 1;


        while (N != F) {

            if (currentFloor == M) { // �ְ����� �������� ��
                currentFloor = 1;
                usedElevator++;
            } else { // �ƴ� ��
                currentFloor++;
                N--;
            }

        }
        usedElevator++;

        System.out.println(usedElevator);

        scanner.close();
    }
}
