package skills_assignment;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Stack;
import java.util.concurrent.Flow;

public class Stack_Exam extends BaseFrame {

    Stack<Color> stack = new Stack<>();

    JPanel colorPanel = createComponent(new JPanel(), 30, 30, 200, 300);

    JButton btnInsertStack = createComponent(createButton("Stack에 삽입", e -> insertColor()), 30, 400, 140, 40);
    JButton btnDeleteStack = createComponent(createButton("Stack에서 삭제", e -> deleteColor()), 180, 400, 140, 40);
    JButton btnSearchCurrentStack = createComponent(createButton("현재 색상", e -> check_CurrentImg()), 330, 400, 140, 40);

    JTextArea textAreaLog = new JTextArea();
    JScrollPane jScrollPane = createComponent(new JScrollPane(textAreaLog), 240, 30, 230, 300);

    String[] array_text = "빨간색,주황색,노란색,초록색,파란색".split(",");
    Color[] array_color = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue};

    int top = -1;

    public Stack_Exam() {
        super(530, 500, "title");

        setLayout(null);

        colorPanel.setBorder(new LineBorder(Color.black));
        textAreaLog.setBorder(new LineBorder(Color.black));

        textAreaLog.requestFocus();
        add(colorPanel, BorderLayout.NORTH);
        add(jScrollPane);
        add(btnInsertStack);
        add(btnDeleteStack);
        add(btnSearchCurrentStack);
    }

    public static void main(String[] args) {
        new Stack_Exam().setVisible(true);
    }

    public void insertColor() {
        top++;
        if (checkEmptyColor() == false) return;
        stack.push(array_color[top]);
        textAreaLog.append(array_text[top] + "이 삽입되었습니다.\n");
        setPanelColor();
    }

    public void check_CurrentImg() {
        if (checkEmptyColor() == false) return;
        textAreaLog.append(array_text[top] + " 입니다.\n");
    }

    public void deleteColor() {
        if (checkEmptyColor() == false) return;
        textAreaLog.append(array_text[top--] + "이 삭제되었습니다.\n");
        stack.pop();
        setPanelColor();
    }

    public boolean checkEmptyColor() {
        if (top <= -1) {
            textAreaLog.append("색이 존재하지 않습니다.\n");
            top = -1;
            return false;
        } else if (top >= 5) {
            textAreaLog.append("색이 존재하지 않습니다.\n");
            top = 4;
            return false;
        }
        return true;
    }

    public void setPanelColor() {
        try {
            colorPanel.setBackground(stack.peek());
        } catch (Exception e) {
            colorPanel.setBackground(null);
            top = -1;
        }
    }
}
