package school.casting;


class Car {
    String name = "차";

    String print() {
        return "[나는 " + name + "이다.]";
    }
}

class Bus extends Car {
    String name = "버스";

    String print() {
        return "[나는 " + name + "이다.]";
    }
}

class Truck extends Car {
    String name = "트럭";

    String print() {
        return "[나는 " + name + "이다.]";
    }
}

public class CastingExam {
    public static void main(String[] args) {
        Car myCar, yourCar;
        Bus myBus, yourBus;
        Truck myTruck, yourTruck;
        myCar = new Car();
        myBus = new Bus();
        myTruck = new Truck();

        System.out.println("[" + myCar.print() + "]");
        System.out.println("[" + myBus.print() + "]");
        System.out.println("[" + myTruck.print() + "]");

        yourCar = myBus;
        yourBus = (Bus) yourCar;
        System.out.println("[" + yourBus.print() + "]");
        yourCar = myTruck;
        yourTruck = (Truck) yourCar;
        System.out.println("[" + yourTruck.print() + "]");
    }
}
