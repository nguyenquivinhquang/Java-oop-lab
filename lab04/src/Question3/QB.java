package Question3;

import java.awt.Graphics;
import javax.swing.JPanel;

public class QB extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth(); // total width
        int height = getHeight(); // total height
        // g.drawLine(0, 0, width, height);
        int step = width / 15;
        for (int i = 0; i <= width; i += step) {
            int y = -i + height;
            g.drawLine(0, 0, i, y);
            g.drawLine(i, y, width, height);
            g.drawLine(0, height, i, i);
            g.drawLine(i, i, width, 0);
            
        }
    }
}
