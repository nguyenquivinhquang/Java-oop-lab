public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {

        this.width = width;
        this.height = height;
        if (width < 0) {
            System.out.println("error");
            this.width = 1;
        }
        if (height < 0) {
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
