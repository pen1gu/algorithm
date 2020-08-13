package skills_assignment;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
public class Main extends BaseFrame {
    boolean check = false;
    JLabel lbImg = createComponent(new JLabel(), 200, 200);
    JButton btnMeat = createButton("굽기", e -> clickChange());

    Main() {
        super(250, 300, "고기굽기");
        setLayout(new FlowLayout());
        add(lbImg);
        add(btnMeat);
        lbImg.setBorder(new LineBorder(Color.black));
        clickChange();
    }

    public void clickChange() {
        String imgName = "", btnName = "";
        if (check == false) {
            imgName = "안익힌고기";
            btnName = "굽기";
            check = true;
        } else {
            imgName = "익힌고기";
            btnName = "초기화";
            check = false;
        }
        lbImg.setIcon(getImage(200, 200, "./Datafiles/"+imgName+".PNG"));
        btnMeat.setText(btnName);
    }
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}