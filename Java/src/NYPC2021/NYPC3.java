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

            if (currentFloor == M) { // ÃÖ°íÃþ¿¡ µµÂøÇßÀ» ¶§
                currentFloor = 1;
                usedElevator++;
            } else { // ¾Æ´Ò ¶§
                currentFloor++;
                N--;
            }

        }
        usedElevator++;

        System.out.println(usedElevator);

        scanner.close();
    }
}
