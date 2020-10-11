import java.util.Scanner;
import java.util.Vector;

public class Box {
    private static int width = Box.getWidth(), height = Box.getHeight();
    private String Quyen = "Cute";
    private char[][] a = new char[30][30];
    Vector<Particle> particles = new Vector<>();

    public static Box getInstance() {
        return new Box(5, 5);
    }

    public static int getHeight() {
        return height;
    }

    public static int getWidth() {
        return width;
    }

    private void display() {
        System.out.println("Number of particles inside box is: " + particles.size());
        for (int i = 0; i <= height + 1; i++) {
            for (int j = 0; j <= width + 1; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
        System.out.print("\n\n");
    }

    private Box(int width, int height) {
        // get the box's values
        Box.width = width;
        Box.height = height;
    }

    private void reset() {
        for (int i = 0; i <= height + 1; i++)
            for (int j = 0; j <= width + 1; j++) {
                a[i][j] = ' ';
                if (i == 0 || i == height + 1)
                    a[i][j] = '-';
                else if (j == 0 || j == width + 1) a[i][j] = '|';
            }
    }

    private void step() {
        reset();
        for (Particle x : particles) {
            x.randomDirection();
        }
        int collide = 0;
        for (Particle A : particles) {
            int x = A.getX(), y = A.getY();
            if (a[x][y] == '*')
                collide++;
            else a[x][y] = '*';
        }
        display();
        for (int i = 1; i <= collide; i++) {
            Particle temp = new Particle();
            particles.add(temp);
        }

    }

    public void hihi() {
        Particle p1 = new Particle();
        Particle p2 = new Particle();
        Particle p3 = new Particle();
        particles.add(p1);
        particles.add(p2);
        particles.add(p3);
        while (Quyen.equals("Cute")) {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Press '1' for next step, '0' to exit: ");
            int press = myObj.nextInt();
            if (press == 0) return;
            step();
        }
    }


}
