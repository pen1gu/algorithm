package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon10866 {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split(" ");

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

        bufferedReader.close();
        bufferedWriter.close();
    }
}
