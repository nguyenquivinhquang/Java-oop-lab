
public class Employee implements Comparable<Employee> {
    private String employeeId, employeeName;
    private int salaryPerHour, noOfLeavingDay, noOfTravelDay;
    public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.noOfLeavingDay = noOfLeavingDay;
        this.salaryPerHour = salaryPerHour;
        this.noOfTravelDay = noOfTravelDay;
    }

    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public int getNoOfTravelDay() {
        return noOfTravelDay;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public int calculateWeeklySalary(){
        return  salaryPerHour * 8 * (5 - noOfLeavingDay + noOfTravelDay / 2);
    }
    @Override
    public  int compareTo(Employee e1) {
        if (e1.getNoOfTravelDay() ==  this.noOfTravelDay){
            if (this.noOfLeavingDay < e1.getNoOfLeavingDay() ) return 1;
            else if (this.noOfLeavingDay < e1.getNoOfLeavingDay() ) return -1; else return  0;

        }
        if (e1.getNoOfTravelDay() == this.noOfTravelDay) return  0;
        if (e1.getNoOfTravelDay() > this.noOfTravelDay) return  1;
        return  -1;

    }

    @Override
    public String toString() {
        return "Name: " + employeeName + ", salary Per Hour = " + salaryPerHour +
                ", Weekly salary = " + calculateWeeklySalary() ;

    }
}
