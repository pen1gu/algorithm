package school.abstract_package;

import java.util.Calendar;

abstract class Calculator {
    public abstract int add(int a, int b);

    public abstract int subtract(int a, int b);

    public abstract double average(int[] a);
}

public class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result / a.length;
    }

    public static void main(String[] args) {
        GoodCalc goodCalc = new GoodCalc();
        System.out.println(goodCalc.add(10, 20));
        System.out.println(goodCalc.subtract(20, 10));
        System.out.println(goodCalc.average(new int[]{10, 20, 30, 40, 50}));
    }
}