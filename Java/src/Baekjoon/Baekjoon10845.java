package baekjoon;

import java.awt.event.ContainerAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon10845 {
    public static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = null;
        int count = Integer.parseInt(bufferedReader.readLine());

        queue = new LinkedList<Integer>();
        StringBuilder stringBuilder = new StringBuilder();
        int back = -1;

        while (count-- > 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            String order = stringTokenizer.nextToken();

            if ("push".equals(order)) {
                back = Integer.parseInt(stringTokenizer.nextToken());
                queue.offer(back);
            } else if ("size".equalsIgnoreCase(order)) {
                stringBuilder.append(queue.size() + "\n");
            } else if ("empty".equals(order)) {
                if (queue.size() == 0) stringBuilder.append("1 \n");
                else stringBuilder.append("0 \n");
            } else if ("pop".equals(order)) {
                if (queue.size() == 0) stringBuilder.append("-1 \n");
                else stringBuilder.append(queue.poll() + "\n");

                if (queue.size() == 0) back = -1;
            } else if ("front".equals(order)) {
                if (queue.size() == 0) stringBuilder.append("-1 \n");
                else stringBuilder.append(queue.peek() + "\n");
            } else if ("back".equals(order)) {
                stringBuilder.append(back + "\n");
            }
        }
        System.out.println(stringBuilder.toString());
        bufferedReader.close();
    }


}


class Test {
    public Test() {
        Bot bot = new Bot();
    }
}


class Bot implements MouseListener {
    public Bot() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}