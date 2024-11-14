package relations;

public class Employee {
    private String name;
    private String designation;
    private String department;
    private String email;
    private String contact;
    private double salary;
    private int number;

    public Employee(String name, String designation, String department, String email, String contact, double salary, int number) {
        this.name = name;
        this.designation =designation;
        this.department =department;
        this.email =email;
        this.contact =contact;
        this.salary = salary;
        this.number =number;
        
    }
    public String getName() {
        return name;
    }
    public String getDesignation() {
        return designation;
    }
    public String getDepartment() {
        return department;
    }
    public String getEmail() {
        return email;
    }
    public String getContact() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Employee [Name: " + name + " , Designation: "+designation+" , Department: "+ department +" , Email: "+ email +" , Contact: "+ contact +" Salary: " + salary + " , Number: "+ number +"]";
    }
}
