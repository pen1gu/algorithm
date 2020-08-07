package nexon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreeNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = scanner.nextInt();
        int num = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

    }
}
