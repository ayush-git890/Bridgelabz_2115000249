import java.util.*;
class Person { // Superclass
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("the name: " + name+" age: " + age);
    }
}
class Teacher extends Person {// Teacher subclass
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("teacher"+" subject: " + subject);
    }
}
class Student extends Person {// Student subclass
    int grade;
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("student"+" grade: " + grade);
    }
}
class Staff extends Person {// Staff subclass
    String department;
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("staff"+" dept.: " + department);
        System.out.println();
    }
}
public class P9_HierarchicalSchoolSystem{
	public static void main(String args[]){
		Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Ayush", 16, 10);
        Staff staff = new Staff("Mrs. Verma", 35, "Admin");
        System.out.println("====teacher========");
        teacher.displayInfo();       
        System.out.println("=====studetn===========");
        student.displayInfo();
        System.out.println("======staff=========");
        staff.displayInfo();
	}
}