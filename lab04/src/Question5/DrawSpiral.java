package Question5;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSpiral extends JPanel {
    private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth(); // total width
        int height = getHeight(); // total height
        // g.drawLine(0, 0, width, height);
        int len = height, err = 30;
        Coordinate firstPoint = new Coordinate();
        Coordinate secondPoint = new Coordinate();
        firstPoint.x = secondPoint.x = width - 20;
        firstPoint.y = secondPoint.y = height - 20;
        len -= err;
        for (int i = 1; i <= 1; i++) {
            secondPoint.y -= len;
            g.drawLine(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
            firstPoint.swap(secondPoint);

            secondPoint.x -= len;
            secondPoint.Debug();

            g.drawLine(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
            firstPoint.swap(secondPoint);
            //g.drawLine(0, 100, 50, 50);
            // secondPoint.y += len;
            // g.drawLine(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
            // firstPoint.swap(secondPoint);

            // len -= err;
            // g.drawLine(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
            // firstPoint.swap(secondPoint);
            // System.out.print( "ste 4 " +x1 + " " + y1 + " " + x2 + " " + y2 +'\n');

        }
    }
}
