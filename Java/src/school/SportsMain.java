package school;


class Sports {
    String name;
    int player;
    Sports(String name, int player) { this.name = name; this.player = player; }
    int getPlayer() { return player; }
    public String getName() { return name; }
    void rule() { System.out.println("경기 규칙은 해당 클래스에서 작성한다."); }

    void currentSports() {
        System.out.println("===================");
        System.out.println("선수 인원 : " + player);
    }
}
class BaseBall extends Sports {

    BaseBall(String name, int player) {
        super(name, player);
        currentSports();
        System.out.println(name + "은 야구공으로 경기를 합니다.");
    }
}
class BasketBall extends Sports {
    BasketBall(String name, int player) {
        super(name, player);
        currentSports();
        System.out.println(name + "은 농구공으로 경기를 합니다.");
    }
}
public class SportsMain {
    public static void main(String[] args) {
        Sports ball = new BaseBall("BaseBall", 9);
        Sports basketBall = new BasketBall("BasketBall", 5);
    }
}


