

import java.util.Random;

public class Particle {
    private int x, y;
    private int boxWidth = Box.getWidth(), boxHeight = Box.getHeight();
    Random generator = new Random();

    public Particle() {

        this.x = generator.nextInt(boxWidth) + 1;
        this.y = generator.nextInt(boxHeight) + 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    private Boolean inBox(int x, int y) {
        return x >= 1 && y >= 1 && x <= boxWidth && y <= boxHeight;
    }

    public void randomDirection() {
        int x, y;
        do {
            x = generator.nextInt(3) - 1;
            y = generator.nextInt(3) - 1;
        } while (x + y == 0 || inBox(x + this.x, y + this.y) == false);
        this.x += x;
        this.y += y;
    }

}
