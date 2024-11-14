package relations;

public class Inheritance_1 {

    public static void main(String[] args) {
        Staff staff1 = new Staff("Amna", "Administrator", "HR", "amna@gmail.com", "0234567890", 70000, 101, 40);
        Staff staff2 = new Staff("Bilal", "Technician", "IT", "bilal@gmail.com", "0320654321", 45000, 102, 36);

        Course course1 = new Course("OOP", "CS101", 3);
        Course course2 = new Course("Data Structures", "CS102", 3);
        Course course3 = new Course("Databases And Algorithms", "CS103", 3);

        Faculty faculty1 = new Faculty("Dr. Iqbal", "Professor", "Computer Science", "iqbal@gmail.com", "0235551234", 75000, 201, 40);
        faculty1.addCourse(course1);
        faculty1.addCourse(course2);

        Faculty faculty2 = new Faculty("Dr. Emaan", "Associate Professor", "Information Technology", "emaan@gmail.com", "0325135678", 70000, 202, 38);
        faculty2.addCourse(course3);

        System.out.println("Staff Members:");
        System.out.println(staff1);
        System.out.println(staff2);

        System.out.println("\nFaculty Members:");
        System.out.println(faculty1);
        System.out.println(faculty2);
    }
}
