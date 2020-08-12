package school.upcasting;

class SuperObject {
    protected String name;
    public void paint(){
        draw();
    }

    public void draw(){
        System.out.println("Super Object");
    }
}
public class SubObject {
    public void draw(){
        System.out.println("Sub Object");
    }

    public static void main(String[] args) {
        SuperObject superObject = new SuperObject();
        superObject.paint();
    }
}
