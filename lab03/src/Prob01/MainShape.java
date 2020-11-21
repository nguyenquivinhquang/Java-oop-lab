package Prob01;

import java.util.Scanner;

public class MainShape {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input shape Rectangle , Oval or Line :");
            String Obj = scan.nextLine();
            if ("Rectangle".equals(Obj)) {
                System.out.println("Input two dimensions, width then height:");
                int width = scan.nextInt();
                int height = scan.nextInt();
                MyBoundedShape rect = new MyRectangle(width, height);
                rect.Draw();
                rect.GetArea(width, height);
            } else if ("Oval".equals(Obj)) {
                System.out.println("Input width and height:");
                int w = scan.nextInt();
                int h = scan.nextInt();
                MyBoundedShape oval = new MyOval(w, h);
                oval.Draw();
                oval.GetArea(w, h);

            } else if ("Line".equals(Obj)) {
                System.out.println("Input coordinate x1 and y1:");
                int x1 = scan.nextInt();
                int y1 = scan.nextInt();
                System.out.println("Input coordinate x2 and y2:");
                int x2 = scan.nextInt();
                int y2 = scan.nextInt();
                MyShape line = new MyLine(x1, y1, x2, y2);
                line.Draw();
            }
        }
    }
}
