import java.lang.Math;

class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point target) {
        return Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));
    }
}

public class Distance {
    public static void main(String[] args) {
        Point point = new Point(3, 5);
        Point target = new Point(4, 7);
        System.out.println(point.distance(target));
    }

}
