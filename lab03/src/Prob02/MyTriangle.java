public class MyTriangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.set(x1, y1);
        v2.set(x2, y2);
        v3.set(x3, y3);
    }

    public MyTriangle(MyPoint temp1, MyPoint temp2, MyPoint temp3) {
        v1 = temp1;
        v2 = temp2;
        v3 = temp3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" + "v1=(" + v1.getX() + ',' + v1.getY() + ") "
                + "v2=(" + v2.getX() + ',' + v2.getY() + ") "
                + "v3=(" + v3.getX() + ',' + v3.getY() + ") ";
    }

    public double getPerimeter(MyPoint a, MyPoint b) {
        return a.distance(b);
    }

    public String getType() {
        double l1 = getPerimeter(v1, v2);
        double l2 = getPerimeter(v2, v3);
        double l3 = getPerimeter(v3, v1);
        if (l1 == l2 && l2 == l3)
            return "Equilateral \n";
        if (l1 == l2 || l2 == l3 || l1 == l3)
            return "Isosceles \n";

        return "Scalene \n";
    }
}