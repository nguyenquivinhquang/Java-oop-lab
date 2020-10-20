package Prob04;

public class Point2D {
    private float x = 0.0f, y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] temp = new float[2];
        temp[0] = x;
        temp[1] = y;
        return temp;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
