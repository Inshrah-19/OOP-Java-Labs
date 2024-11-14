package relations;

public class Staff extends Employee {
    private int workingHours;

    public Staff(String name, String designation, String department, String email, String contact, double salary, int number, int workingHours) {
        super(name, designation, department, email, contact, salary, number);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Working Hours: " + workingHours;
    }
}
