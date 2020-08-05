package myproject;

import java.applet.Applet;
import java.awt.*;

/*
<applet code = "AppletFrame" width = 300 height = 50>
</applet>
*/
class SampleFrame extends Frame {
    SampleFrame(String title) {
        super(title);
    }

    public boolean handleEvent(Event evtObj) {
//        if (evtObj.id == Event.WINDOW_DESTORY) {
//            hide();
//            return true;
//        }
        return super.handleEvent(evtObj);
    }

    public void paint(Graphics g) {
        g.drawString("This is in frame window", 10, 20);
    }
}


public class AppletFrame extends Applet {
    SampleFrame f;

    public void init() {
        f = new SampleFrame("A Frame Window");
        f.show();
        f.resize(250, 100);
    }

    public void stop() {
        f.hide();
    }

    public void start() {
        f.show();
    }

    public void paint(Graphics g) {
        g.drawString("This is in applet window.", 10, 20);
    }
}
