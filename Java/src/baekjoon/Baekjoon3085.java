package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon3085 {

    int input;
    String[][] array;
    int result = 0;

    //row = x, column = y
    Baekjoon3085() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(bufferedReader.readLine());
        String[][] array = new String[input][input];

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                String[] candy = bufferedReader.readLine().split("");
                array[i][j] = candy[j];
            }
        }

        bufferedReader.close();

        for (int y = 0; y < input; y++) {
            for (int x = 0; x < input; x++) {
                startCalculate(x, y);
            }
        }
    }

    public void startCalculate(int x, int y) {
        if (y < input - 1) {
            changeDown(x, y);
        }
        if (x < input - 1) {
            changeRight(x, y);
        }
    }

    public void changeDown(int x, int y) {
        String temp = "";
        temp = array[y][x];
        array[y][x] = array[y][x + 1];

        checkRow(x, y);

        array[y][x + 1] = array[y][x];
        array[y][x] = temp;
    }

    public void changeRight(int x, int y) {
        String temp = "";
        temp = array[y][x];
        array[y][x] = array[x + 1][y];

        checkColumn(x, y);

        array[x + 1][y] = array[y][x];
        array[y][x] = temp;
    }

    public void checkRow(int x, int y) {
        String topY = array[0][y], topX1 = array[x][0], topX2 = array[x + 1][0];
        int xCount1 = 0, xCount2 = 0, yCount = 0;
        for (int sy = 0; sy < input; sy++) {
            for (int sx = 0; sx < input; sx++) {
                if (sx < input - 1) {
                    if (topX1 == array[x][sy]) {
                        xCount1++;
                    } else {
                        topX1 = array[sx][y];
                        xCount1 = 1;
                    }
                    if (topX2 == array[x + 1][sy]) {
                        xCount2++;
                    } else {
                        topX2 = array[y][sx];
                        xCount2 = 1;
                    }
                }
                if (topY == array[x][sy]) {
                    yCount++;
                } else {
                    topY = array[x][sy];
                    yCount = 1;
                }
                result = Math.max(result, Math.max(yCount, Math.max(xCount1, xCount2)));
            }
        }
    }

    public void checkColumn(int x, int y) {

    }

    public static void main(String[] args) {
        try {
            new Baekjoon3085();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
