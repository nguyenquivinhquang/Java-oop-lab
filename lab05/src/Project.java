import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Project {

    private String projectId;
    private Date startDate, endDate;
    private  int totalEmployee;
    static final String SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
    private static Random generator = new Random(19900828);

    public Project(String projectId,int totalEmployee, Date startDate, Date endDate) {
        this.totalEmployee = totalEmployee;
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        RandomCreateEmployee();
    }
    public static String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(SOURCE.charAt(generator.nextInt(SOURCE.length())));
        return sb.toString();
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public String getProjectId() {
        return projectId;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    private void RandomCreateEmployee() {
        for (int i  = 1; i <= totalEmployee; i++) {
            int salaryPerHour = generator.nextInt(500) + 1;
            int noOfLeavingDay = generator.nextInt(7) + 1;
            int noOfTravelDay  = generator.nextInt(7) + 1;

            String employeeId = Integer.toString(i);

            // random Employee name
            int[] array = new int[7]; // length is bounded by 7
            for (int j = 0 ; j < 7; j++) {
                array[j] = generator.nextInt(50) + 32;
            }
            String employeeName = new String(randomString(7));

            Employee employeeTemp = new Employee(employeeId, employeeName, salaryPerHour, noOfLeavingDay, noOfTravelDay);
            listOfEmployee.add(employeeTemp);
        }
        Collections.sort(listOfEmployee);
    }
    public long estimateBudget(){
        long budget = 0;
        for (Employee e : listOfEmployee){
            budget = budget + e.getSalaryPerHour()*24*7;
        }
        long milliSecondsElapsed = endDate.getTime() - startDate.getTime();
        long diff = TimeUnit.HOURS.convert(milliSecondsElapsed, TimeUnit.MILLISECONDS);

        return budget * diff;
    }
    public String toString(){
        String str = "";
        for (Employee e: listOfEmployee){
            str = str + "\n" + e;
        }
        return str;
    }

}
