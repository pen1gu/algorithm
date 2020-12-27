package baekjoon;

import java.util.Calendar;
import java.util.Scanner;

public class Baekjoon1924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        String[] dow = "SUN,MON,TUE,WED,THU,FRI,SAT".split(",");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2007, x-1, y);
        System.out.println(dow[calendar.get(Calendar.DAY_OF_WEEK)-1]);
    }
}
