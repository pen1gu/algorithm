package school.abstract_package;

abstract class ShapeExam {
    abstract double getArea(int radius);

    abstract double getCircum(int radius);
}

public class CircleShape extends ShapeExam {

    @Override
    double getArea(int radius) {
        return 2 * radius * Math.PI;
    }

    @Override
    double getCircum(int radius) {
        return radius * getArea(radius) / 2;
    }

    public static void main(String[] args) {
        int radius = 5;
        CircleShape circleShape = new CircleShape();
        System.out.println(circleShape.getArea(radius));
        System.out.println(circleShape.getCircum(radius));
    }
}
