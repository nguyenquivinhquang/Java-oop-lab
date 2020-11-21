package TestDemo;

class FatherClass {
    public int x, y;
    public FatherClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public FatherClass() {
        this.x = 12;
        this.y = 12;
    }
}
class ChildClass extends FatherClass {
    public ChildClass(int x, int y) {
        super(x, y);
    }
    public ChildClass() {
        super();
    }
    public void printResult() {
        System.out.println(super.x + " " + super.y);
    }
}
public class Test {

    public static void main(String[] args) {
        ChildClass test1 = new ChildClass(1, 1);
        ChildClass test2 = new ChildClass();
        test1.printResult();
        test2.printResult();
    }
}