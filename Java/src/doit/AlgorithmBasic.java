package doit;

import java.util.Scanner;

public class AlgorithmBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("n3의 값 : ");
        int n1 = scanner.nextInt();
        System.out.print("n2의 값 : ");
        int n2 = scanner.nextInt();
        System.out.print("n3의 값 : ");
        int n3 = scanner.nextInt();

        int max = n1;
        if (n2 > max) max = n2;
        if (n3 > max) max = n3;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
