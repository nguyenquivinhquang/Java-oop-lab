package Prob01;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyOval extends MyBoundedShape {
    public static int width, height;


    public MyOval(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    
    public void GetArea(double x, double y) {
        double Area = Math.PI * (x / 2) * (y / 2);
        System.out.println("Area of the Oval is:" + Area);
    }


    public void Draw() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Draw Oval");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(300, 300);

        final JTextField text = new JTextField();
        ;
        frame.add(text, BorderLayout.SOUTH);

        frame.addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent me) {
            }

            public void mouseReleased(MouseEvent me) {
            }

            public void mouseEntered(MouseEvent me) {
            }

            public void mouseExited(MouseEvent me) {
            }

            public void mouseClicked(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();
                text.setText("X:" + x + " Y:" + y);
            }
        });

        frame.getContentPane().add(new draw(1));
        frame.setVisible(true);
    }
}
