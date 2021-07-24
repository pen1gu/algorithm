package baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Baekjoon10866 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        Deque<Integer> deque = new ArrayDeque<Integer>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (input.length > 1) {
                if (input[0].equals("push_back")) {
                    deque.addLast(Integer.parseInt(input[1]));
                } else if (input[0].equals("push_front")) {
                    deque.addFirst(Integer.parseInt(input[1]));
                }
            } else {
                switch (input[0]) {
                    case "pop_front":
                        System.out.println(deque.size() == 0 ? -1 : deque.pop());
                        break;
                    case "pop_back":
                        System.out.println(deque.size() == 0 ? -1 : deque.pollLast());
                        break;
                    case "size":
                        System.out.println(deque.size());
                        break;
                    case "empty":
                        System.out.println(deque.size() == 0 ? 1 : 0);
                        break;
                    case "front":
                        System.out.println(deque.size() == 0 ? -1 : deque.peekFirst());
                        break;
                    case "back":
                        System.out.println(deque.size() == 0 ? -1 : deque.peekLast());
                        break;
                }
            }
        }

        scanner.close();
    }
}
