public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(12, 5);
        Rectangle rect2 = new Rectangle(4, 13);
        Rectangle rect3 = new Rectangle(5, 4);
        Rectangle rect4 = new Rectangle(4, -1);
        Rectangle rect5 = new Rectangle(-1, -5);

        rect1.visualize();
        rect2.visualize();
        rect3.visualize();
        rect4.visualize();
        rect5.visualize();
    }
}
