package school;

class CircleArea_Exam {
    protected static double area(int r) {
        return Math.PI * r * r;
    }

    protected static double round(int r) {
        return 2 * Math.PI * r;
    }
}

public class CircleMainTest extends CircleArea_Exam {
    public static void main(String[] args) {
        System.out.println("원의 면적은 " + area(10));
        System.out.println("원의 둘레는 "+round(10));
    }
}
