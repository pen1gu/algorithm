package school.abstract_package;

abstract class Ship{
    abstract int Passengers();
    abstract int Luggage();
}

public class AugShip extends Ship{

    private String name;
    private int passengers;
    private int luggage;
    AugShip(String name, int passengers, int luggage){
        this.name = name;
        this.passengers = passengers;
        this.luggage = luggage;
    }

    public String getName() {
        return name;
    }

    @Override
    int Passengers() {
        return passengers;
    }

    @Override
    int Luggage() {
        return luggage;
    }

    public static void main(String[] args) {
        AugShip augShip = new AugShip("SunFlower호",100,1000);
        System.out.println(augShip.getName());
        System.out.println(augShip.Passengers()+"명");
        System.out.println(augShip.Luggage()+"kg");
    }
}
