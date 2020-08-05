package school;

class Student {
    String name;
    String hakbun;
    String phone;
    String juso;
    String major;

    public Student() {
    }

    public Student(String name, String hakbun) {
        this.name = name;
        this.hakbun = hakbun;
    }

    public void study() {
        System.out.println("공부하다.");
    }

    public void eat() {
        System.out.println("식사하다");
    }

    public void test() {
        System.out.println("시험보다.");
    }

    public void extra_act() {
        System.out.println("동아리 활동하다.");
    }
}

class Leader extends Student {

    boolean checkLeader;

    Leader(String name, String hakbun, boolean checkLeader) {
        super(name, hakbun);
        this.checkLeader = checkLeader;
    }

    public void isLeader() {
        if (checkLeader == true) System.out.println(name + "은 학급회장입니다..");
        else System.out.println("학급회장이 아닙니다.");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Leader leader = new Leader("홍길동", "30130", true);
        leader.isLeader();
    }
}
