package Question5;

public class Coordinate {
    public int x, y;
    public void swap(Coordinate a){
        Coordinate temp = new Coordinate();
        temp.x = this.x;
        temp.y = this.y;
        this.x = a.x;
        this.y = a.y;
        a.x = temp.x;
        a.y = temp.y;
    }
    public void Debug(){
        System.out.println(this.x + " " + this.y);
    }
}
