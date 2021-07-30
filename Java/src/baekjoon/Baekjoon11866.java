package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon11866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        int N = scanner.nextInt();
        int K = scanner.nextInt();


        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");

        while (queue.size() > 1) {

            for (int i = 0; i < K - 1; i++) {
                int val = queue.poll();
                queue.offer(val);
            }

            stringBuilder.append(queue.poll()).append(", ");
        }

        stringBuilder.append(queue.poll()).append(">");
        System.out.println(stringBuilder);

        scanner.close();
    }
}
