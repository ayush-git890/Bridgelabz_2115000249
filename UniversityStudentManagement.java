import java.util.*;
class Student {
    private static String universityName = "GLA University";
    private static int count = 0;//it will count total student .....
    private final int rollNumber;//roll number of each student....
    private String name;
    private double grade;

    public Student(int rollNumber, String name, double grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        count++;
    }
    public void printData() {
        if (this instanceof Student) {
            System.out.println("Uni. Name---> " + universityName);
            System.out.println("ROll.No.--> " + rollNumber);
            System.out.println("name--> " + name);
            System.out.println("total grade--> " + grade);
        }
    }
    public static void displayTotalStudents() {
        System.out.println("here is total students who enrolled ---> " + count);
    }
}
public class UniversityStudentManagement{
	public static void main(String args[]){
		Student s1 = new Student(249, "Ayush Agarwal", 10);
        Student s2 = new Student(123, "Rohit Kumar", 5);
        s1.printData();
		System.out.println("=================================");
        s2.printData();

        Student.displayTotalStudents();
	}
}