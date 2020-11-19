import java.util.Date;

public class ProjectPrinter implements Runnable {
    private  Project project;
    public ProjectPrinter(Project proj) {
        project = proj;

    }
    @Override
    public void run() {

       try {
            for (Employee e: project.getListOfEmployee()){
                System.out.print("Project ID: " + project.getProjectId() + " Project Duration: " + project.getStartDate() + " to " + project.getEndDate());
                System.out.println(e.toString());
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
            System.out.println("Thread is interrupted");
        }
    }
}


