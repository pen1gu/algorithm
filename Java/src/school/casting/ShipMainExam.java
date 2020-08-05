package school.casting;

class Ship {
    public String Name() {
        return "배 이름";
    }
}

class MyShip extends Ship {
    public String Name() {
        return "해적선";
    }
}

class YourShip extends Ship {
    public String Name() {
        return "타이타닉 호";
    }
}

class ShipName {
    public static void search(Ship ship) {
        if (ship instanceof MyShip) {
            MyShip myShip = (MyShip) ship;
            System.out.println("MyShip 이름 :" + myShip.Name());
        } else if (ship instanceof YourShip) {
            YourShip yourShip = (YourShip) ship;
            System.out.println("YourShip 이름 : " + yourShip.Name());
        }
    }
}

public class ShipMainExam {
    public static void main(String[] args) {
        Ship myShip = new MyShip();
        Ship yourShip = new YourShip();
        ShipName.search(myShip);
        ShipName.search(yourShip);
    }
}
