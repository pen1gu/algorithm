package alogrithm_skills;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs {

    int n, m, v;
    int[][] map;
    boolean[] visit;

    public void bfs(int k, int n) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(k);
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            visit[temp] = true;
            System.out.printf("%d ", temp);
            for (int i = 1; i <= n; i++) {
                if (map[temp][i] == 1 && !visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }
    }

    Bfs() {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        v = scanner.nextInt();
        map = new int[n + 1][m + 1];
        visit = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            map[x][y] = map[y][x] = 1;
        }

        bfs(v, n);

        scanner.close();
    }

    public static void main(String[] args) {
        new Bfs();
    }
}
