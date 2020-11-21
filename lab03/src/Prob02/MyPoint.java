public class MyPoint {
    private int x, y;


    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY( ){
        return y;
    }
    public double distance(MyPoint target) {
        return Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));
    }

}