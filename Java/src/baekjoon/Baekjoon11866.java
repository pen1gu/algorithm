package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon11866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int N = scanner.nextInt();
        int K = scanner.nextInt();


        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        /*
         *  ������ �κ��� ����� > ��ȣ ���� ������ ���� ������
         *  �ϰ������� ����ϱ� ���� ������ ���Ҹ� ������ ��������
         *  �ݺ��ϰ� ������ ���Ҵ� �״�� ����Ѵ�.
         */
        while (q.size() > 1) {

            for (int i = 0; i < K - 1; i++) {
                int val = q.poll();
                q.offer(val);
            }

            sb.append(q.poll()).append(", ");
        }

        // ������ ���� ����� �� > �� �ٿ��ش�.
        sb.append(q.poll()).append('>');
        System.out.println(sb);

        scanner.close();
    }
}
