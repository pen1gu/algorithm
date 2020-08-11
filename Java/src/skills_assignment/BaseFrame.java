//package frame;
package skills_assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BaseFrame extends JFrame {

    public BaseFrame(int width, int height, String title) {
        setSize(width, height);
        setTitle(title);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void errorMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg, "메시지", JOptionPane.ERROR_MESSAGE);
    }

    public void informationMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg, "메시지", JOptionPane.INFORMATION_MESSAGE);
    }

    public static JLabel createLabel(JLabel label, Font font) {
        label.setFont(font);
        return label;
    }

    public static <T extends JComponent> T createComponent(T comp, int x, int y, int w, int h) {
        comp.setBounds(x, y, w, h);
        return comp;
    }

    public static <T extends JComponent> T createComponent(T comp, int x, int y) {
        comp.setPreferredSize(new Dimension(x, y));
        return comp;
    }

    public static JButton createButton(String text, ActionListener e) {
        var btn = new JButton(text);
        btn.addActionListener(e);
        return btn;
    }

    public static JButton createButtonWithOutMargin(String text, ActionListener e, Color color) {
        var btn = new JButton(text);
        btn.addActionListener(e);
        btn.setMargin(new Insets(0, 0, 0, 0));
        btn.setForeground(color);
        return btn;
    }

    public static ImageIcon getImage(int w, int h, String path) {
        return new ImageIcon(Toolkit.getDefaultToolkit().getImage(path).getScaledInstance(w, h, Image.SCALE_SMOOTH));
    }

    public void openFrame(JFrame frame) {
        dispose();
        frame.setVisible(true);
    }
}
