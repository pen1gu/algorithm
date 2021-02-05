package baekjoon;

import java.util.Scanner;

public class Baekjoon1259 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String value = "";
        loop:
        do {
            value = scanner.nextLine();

            if (value.equals("0")) break;

            String[] dataArr = value.split("");
            int countA = dataArr.length - 1;
            for (int i = 0; i < dataArr.length / 2; i++) {
                if (!dataArr[i].equals(dataArr[countA])) {
                    System.out.println("no");
                    continue loop;
                }
                countA--;
            }

            System.out.println("yes");
        } while (true);
    }
}
