package school;

class GrandFather {
    private String name;

    GrandFather(String name) {
        this.name = name;
        System.out.println("GrandFather 생성자");
    }
}

public class MyClass extends GrandFather {
    MyClass(String str) {
        super(str);
        System.out.println("MyClass 생성자");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass("홍길동");
    }
}
