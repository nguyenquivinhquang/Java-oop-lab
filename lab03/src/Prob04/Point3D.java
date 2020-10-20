package Prob04;

public class Point3D extends  Point2D {
    private float z = 0.0f;
    public Point3D(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public  Point3D(){

    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] temp = new float[3];
        temp[0] = super.getX();
        temp[1] = super.getY();
        temp[2] = z;
        return temp;
    }
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}
