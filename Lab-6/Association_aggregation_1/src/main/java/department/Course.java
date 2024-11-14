package department;

public class Course {
    private String courseId;
    private String courseName;
    private int creditHours;
    public Course(String courseId, String courseName, int creditHours) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }
    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName + ", Credit Hours: "+ creditHours;
    }
}