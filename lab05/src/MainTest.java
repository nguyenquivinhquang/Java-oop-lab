import java.util.Date;

public class MainTest {
    public static void main(String[] args) {
        Date st = new Date(2020, 5, 7, 6, 00);
//        st.setDate(12);
//        st.setHours(13);

        Date ed = new Date(2020, 6, 17, 6, 00);
        Project project = new Project("1", 10,st, ed);
        ProjectPrinter testProjectPrinter = new ProjectPrinter(project);
        testProjectPrinter.run();

    }
}
