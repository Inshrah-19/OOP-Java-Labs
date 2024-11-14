package relations;

public class Course {
    private String courseName;
    private String courseCode;
    private int courseCreditHours;

    public Course(String courseName, String courseCode, int courseCreditHours) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCreditHours = courseCreditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCourseCreditHours() {
        return courseCreditHours;
    }

    @Override
    public String toString() {
        return "Course [Name: " + courseName + ", Code: " + courseCode + ", Credit Hours: " + courseCreditHours + "]";
    }
}
