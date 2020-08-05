package school;

class Point {
    private int x, y;

    void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void showPoint() { System.out.println("(" + x + "," + y + ")"); }
}

class ColorPoint extends Point {
    private String color;

    void setColor(String color) { this.color = color; }

    void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        Point point = new Point();
        point.set(1, 2);
        point.showPoint();

        ColorPoint colorPoint = new ColorPoint();
        colorPoint.set(3, 4);
        colorPoint.setColor("red");
        colorPoint.showColorPoint();
    }
}
