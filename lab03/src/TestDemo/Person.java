package TestDemo;

public class Person {
    String name;
    private int yearOfBirth, curYear, age;
    public int familyMember;
    public Person(String name, int curYear, int yearOfBirth){
        this.name = name;
        this.curYear = curYear;
        this.yearOfBirth = yearOfBirth;
    }
    public int getAge() {
        return age;
    }
    private void  computeAge(){
        age = curYear - yearOfBirth;
    }
}
