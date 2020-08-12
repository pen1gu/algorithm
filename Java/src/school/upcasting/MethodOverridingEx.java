package school.upcasting;

import java.awt.*;

class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}


public class MethodOverridingEx {
    static void paint(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);

        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}
