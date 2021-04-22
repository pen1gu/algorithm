package alogrithm_skills;

import java.util.ArrayList;

public class Tetris {

    static String[][] map = new String[10][10];

    static ArrayList<Integer> point = new ArrayList<>();

    public static void main(String[] args) {

        point.add(1);
        point.add(2);
        point.add(3);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && (j == 1 || j == 2 || j == 3)) {
                    System.out.print("* ");
                } else {
                    System.out.printf("_ ");
                }
            }
            System.out.println();
        }
    }
}

class MapPoint {
    MapPoint(int x, int y, int[][] arr) {

    }
}
