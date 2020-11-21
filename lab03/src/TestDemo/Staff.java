package TestDemo;

public class Staff extends Person{
    private String school;
    private double pay;
    public Staff(String name, int curYear, int yearOfBirth, String school, double pay){
        super(name, curYear, yearOfBirth);
        this.school = school;
        this.pay = pay;
    }
    public int getAge(){
        return super.getAge();
    }

    @Override
    public String toString() {
        return "Staff{" + "school='" + school + '\'' + ", pay=" + pay +
                ", name='" + name + '\'' + ", familyMember=" + familyMember + '}';
    }
}
