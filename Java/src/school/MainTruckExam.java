//package school;
//
//class Car {
//    String carname;
//    String color;
//    int velocity;
//
//    void speedUp() {
//        velocity += 5;
//        System.out.println("속도  " + velocity + " 증가");
//    }
//
//    void speedDown() {
//        velocity -= 5;
//        System.out.println("속도 " + velocity + " 감소");
//    }
//}
//
//class Truck extends school.casting.Car {
//    int ton = 5;
//
//    void speedUp() {
//        velocity += 10;
//        System.out.println("속도 " + velocity + " 증가");
//    }
//}
//
//public class MainTruckExam {
//    public static void main(String[] args) {
//        Truck truck = new Truck();
//        truck.speedUp();
//        truck.speedDown();
//    }
//}