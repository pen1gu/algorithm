package alogrithm_skills;

public class GCD {
    public static void main(String[] args) {
        int a = 20, b = 10,temp = 0;
        temp = b;
        a = a < b ? b : a;
        
        System.out.println(gcd(a, b));
    }

    static int gcd(int a, int b) {
        while (b > 0) // b가 0이 된다는 것은 최종적으로 나머지가 나누어 졌다는 뜻이므로 최대공약수가 계산 됐다는 의미이다.
        {
            int tmp = a; // 이전에 저장한 b의 값을 tmp에 저장
            a = b; // b 를 a에 저장
            b = tmp % b; // tmp 에 있는 a 값을 b로 나누어 b에 r 저장
        }
        return a;
    }
}
