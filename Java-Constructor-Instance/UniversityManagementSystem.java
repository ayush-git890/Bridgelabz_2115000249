import java.util.*;
class Student {
    public int rollNumber;  
    protected String name;  
    private double CGPA;    
    public Student() {
        this.rollNumber = 0;
        this.name = "";
        this.CGPA = 0.0;
    }
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
// here i am using subclass initializing Protected Access
class PostgraduateStudent extends Student {
    public String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        this.rollNumber = rollNumber; 
        this.name = name;             
        this.setCGPA(CGPA);           
        this.specialization = specialization;
    }

    public void displayPGStudent() {
        System.out.println("Postgraduate Student: " + name + " " + specialization);
    }
}
public class UniversityManagementSystem {
    public static void main(String args[]) {
        Student s1 = new Student(250, "Rohan", 5.5);
        s1.displayStudent();

        PostgraduateStudent pg1 = new PostgraduateStudent(249, "Ayush", 10, "DSA");
        pg1.displayPGStudent();

        // here i am using setter for modifying the cgpa
        s1.setCGPA(9.9);
        System.out.println("latest cgpa after update--> " + s1.getCGPA());
    }
}