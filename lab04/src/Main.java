import Question1.*;
import Question2.*;
import Question3.*;
import Question5.DrawSpiral;

import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

  public static void Q1() {
    new NameDialog().main(null);
  }

  public static void Q2() {
    // create a panel that contains our drawing
    DrawPanel panel = new DrawPanel();

    // create a new frame to hold the panel
    JFrame application = new JFrame();

    // set the frame to exit when it is closed
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    application.add(panel); // add the panel to the frame
    application.setSize(250, 250); // set the size of the frame
    application.setVisible(true); // make the frame visible
  }

  public static void Q3a() {
    // create a panel that contains our drawing
    QA panel = new QA();

    // create a new frame to hold the panel
    JFrame application = new JFrame();

    // set the frame to exit when it is closed
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    application.add(panel); // add the panel to the frame
    application.setSize(500, 500); // set the size of the frame
    application.setVisible(true); // make the frame visible
  }

  public static void Q3b() {
    // create a panel that contains our drawing
    QB panel = new QB();

    // create a new frame to hold the panel
    JFrame application = new JFrame();

    // set the frame to exit when it is closed
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    application.add(panel); // add the panel to the frame
    application.setSize(500, 500); // set the size of the frame
    application.setVisible(true); // make the frame visible
  }

  public static void Q5a() {
    // create a panel that contains our drawing
    DrawSpiral panel = new DrawSpiral();

    // create a new frame to hold the panel
    JFrame application = new JFrame();

    // set the frame to exit when it is closed
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    application.add(panel); // add the panel to the frame
    application.setSize(500, 500); // set the size of the frame
    application.setVisible(true); // make the frame visible
  }

  public static void main(String[] args) {
    Q5a();
  }

}