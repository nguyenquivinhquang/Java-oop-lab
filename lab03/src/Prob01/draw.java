package Prob01;

import java.awt.*;
import javax.swing.*;

public class draw extends JPanel {

    private int s;

    public draw(int i) {
        this.s = i;
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        switch (s) {
            case 0:
                g.drawLine(MyLine.getX1(), MyLine.getY1(), MyLine.getX2(), MyLine.getY2());
                break;
            case 1:
                g.drawOval(0, 0, MyOval.getWidth(), MyOval.getHeight());
                break;
            case 2:
                g.drawRect(0, 0, MyRectangle.getWidth(), MyRectangle.getHeight());
                break;
        }
    }
}

