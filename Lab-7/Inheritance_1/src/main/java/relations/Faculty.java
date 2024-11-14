package relations;
import java.util.ArrayList;

public class Faculty extends Employee{
    private int workingHours;
    private ArrayList<Course> courses;

    public Faculty(String name, String designation, String department, String email, String contact, double salary, int number, int workingHours) {
        super(name, designation, department, email, contact, salary, number);
        this.workingHours = workingHours;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public String toString() {
        StringBuilder facultyInfo = new StringBuilder(super.toString() + ", Working Hours: " + workingHours + "\nCourses:");
        for (Course course : courses) {
            facultyInfo.append("\n- ").append(course);
        }
        return facultyInfo.toString();
    }
}
