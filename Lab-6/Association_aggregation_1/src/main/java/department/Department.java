package department;
import java.util.ArrayList;

public class Department {
    private String departmentId;
    private String departmentName;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Faculty> faculties = new ArrayList<>();

    public Department(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department ID: ").append(departmentId)
          .append(", Department Name: ").append(departmentName).append("\n");

        sb.append("Courses:\n");
        for (Course co : courses) {
            sb.append("  ").append(co).append("\n");
        }

        sb.append("Faculties:\n");
        for (Faculty fa : faculties) {
            sb.append("  ").append(fa).append("\n");
        }
        return sb.toString();
    }
}
