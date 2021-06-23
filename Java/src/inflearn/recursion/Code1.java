package inflearn.recursion;

public class Code1 {

    public static void main(String[] args) {

    }

    static int cnt =0 ;
    public static void func() {

        if (cnt == 5) return;
        cnt++;

        System.out.println("Hello...");
        func();

    }
}