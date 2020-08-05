package myproject;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(1,1));
    }
    public static String solution(int a, int b) {
        String[] week = "SUN,MON,TUE,WED,THU,FRI,SAT".split(",");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, a-1, b);
        return week[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}