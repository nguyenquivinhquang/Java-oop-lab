class Triangle {
    private int l1, l2, l3;

    public Triangle(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public int getl1() {
        return l1;
    }

    public int getl2() {
        return l2;
    }

    public int getl3() {
        return l3;
    }

    public String verify() {

        if (l1 + l2 <= l3 || l2 + l3 <= l1 || l3 + l1 <= l2)
            return "Not Triangle \n";
        if (l1 == l2 && l2 == l3)
            return "Equilateral \n";
        if (l1 == l2 || l2 == l3 || l1 == l3)
            return "Isosceles \n";

        return "Scalene \n";
    }
}

public class TriangleVerification {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 11, 5);
        System.out.print(triangle.verify());
    }
}
