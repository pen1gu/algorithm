package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        System.out.println(s);
        System.out.println(st.countTokens());


//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        String arr[] = input.trim().split(" ");
//
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i] + " " + i);
////        }
//        System.out.println(arr.length);
    }
}
