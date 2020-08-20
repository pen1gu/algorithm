package skills_assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI_Basic_1 extends BaseFrame {

    GUI_Basic_1() {
        super(300, 300, "");
        setLayout(new BorderLayout());

        for (String text : "North,West,Center,East,South".split(",")) {
            add(createButton(text, this::is_currentPoint), text);
        }
    }

    public void is_currentPoint(ActionEvent e) {
        JOptionPane.showMessageDialog(null, e.getActionCommand());
    }

    public static void main(String[] args) {
        new GUI_Basic_1().setVisible(true);
    }
}
