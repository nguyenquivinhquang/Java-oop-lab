public class Point2D {

}

class Point {
    private int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int val) {
        this.x = this.y = val;
    }

    public Point(Point temp) {
        this.x = temp.x;
        this.y = temp.y;
    }

    public String toString() {

        String temp = Integer.toString(x) + " " + Integer.toString(y);
        return temp;
    }

    public Boolean checkSame(Point temp) {
        if (this.x == temp.getX() && this.y == temp.getY())
            return true;
        else return false;
    }

    public Point midPoint(Point temp1, Point temp2) {
        Point t = new Point((temp1.getX() + temp2.getX()) / 2,(temp1.getY() + temp2.getY()) / 2);
        ///t.setX();
        return  t;
    }


}