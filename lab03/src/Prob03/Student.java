package Prob03;

public class Sudent extends Person {


    private String program;
    private int year;
    private double fee;

    public Sudent(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.year = year;
        this.fee = fee;
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Sudent[Person[" +
                "name= " + super.getName()+
                "addres= " + super.getAddress()+
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                ']';
    }
}
