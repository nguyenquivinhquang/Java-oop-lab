class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {

        this.width = width;
        this.height = height;
        if (width <= 0) {
            System.out.println("error");
            this.width = 1;
        }
        if (height <= 0) {
            System.out.println("error");
            this.height = 1;
        }

    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void visualize() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }
}

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
