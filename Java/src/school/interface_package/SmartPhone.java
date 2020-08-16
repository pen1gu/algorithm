package school.interface_package;

interface IphoneInterface{
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLoGo() {
        System.out.println("**Phone**");
    }
}
class Calc{
    public int calculate(int x, int y) {
        return x + y;
    }
}
class SmartPhone extends Calc implements IphoneInterface{
    public void sendCall() {
        System.out.println("띠리리리링");
    }
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }
    public void schedule() {
        System.out.println("일정을 관리합니다.");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SmartPhone phone = new SmartPhone();
        phone.printLoGo();
        phone.sendCall();
        phone.receiveCall();
        System.out.println("3과 5를 더하면" + phone.calculate(3, 5));
        phone.schedule();
    }

}
