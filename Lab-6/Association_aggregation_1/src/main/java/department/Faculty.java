package department;
import java.util.ArrayList;
public class Faculty {
    
    private String facultyId;
    private String facultyName;
    private String designation;  
    private String contact;      
    private double salary;       
    private String email; 
    private ArrayList<Course> courseList; 

    public Faculty(String facultyId, String facultyName, String designation, String contact, double salary, String email) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.designation= designation;
        this.contact = contact;
        this.salary = salary;
        this.email = email;
        this.courseList = new ArrayList<>();
    }

    public void addCourse(Course c) {
        courseList.add(c);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Faculty ID: ").append(facultyId).append(", Faculty Name: ").append(facultyName).append("\n");
        sb.append("Designation: ").append(designation).append(", Contact: ").append(contact) .append(", Salary: ").append(salary).append(", Email: ").append(email).append("\n");
        sb.append("Courses Taught:\n");
        for (Course co : courseList) {
            sb.append("  ").append(co).append("\n");
        }
        return sb.toString();
    }
}
