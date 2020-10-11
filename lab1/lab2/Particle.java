package lab2;

public class Particle {
    private int x, y;
    private int boxWidth = Box.getWidth(), boxHeight = Box.getHeight();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private Boolean inBox(int x, int y) {
        if (x < 1 || y < 1 || x > boxHeight || y > boxHeight)
            return false;
        return true;
    }

    public void randomDirection() {
        int x = 0, y = 0;
        do {
            Random generator = new Random(19900828);
            x = generator.nextInt(2) - 1;
        } while (x + y != 0 && inBox(x + this.x, y + this.y) == true);
    }

}
