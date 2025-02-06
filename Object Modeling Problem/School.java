import java.util.*;
class Student { // here we created Student class...
    private String studentName;
    private int studentID;
    private List<Course> arr; // here we created an ArrayList of Course objects inside Student...

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.arr = new ArrayList<>();
    }
    public void enrollCourse(Course course) {
        arr.add(course);
        course.addStudent(this);
    }
    public void printStudentDetails() {
        System.out.println("Student Name: " + studentName + ", Student ID: " + studentID);
        System.out.print("Enrolled Courses: ");
        for (Course c : arr){
            System.out.print(c.getCourseName() + " ");
        }
        System.out.println();
    }
	public String getStudentName() {
        return studentName;
    }
}
class Course { // here we created Course class...
    private String courseName;
    private List<Student> arr1; // here we created an ArrayList of Student objects inside Course...

    public Course(String courseName) {
        this.courseName = courseName;
        this.arr1 = new ArrayList<>();
    }
    public String getCourseName() {
        return courseName;
    }
    public void addStudent(Student student) {
        arr1.add(student);
    }
}
public class School { // here we created School class...
    private String schoolName;
    private List<Student> arr2; // here we created an ArrayList of Student objects inside School...

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.arr2 = new ArrayList<>();
    }
    public void addStudent(Student student) {
        arr2.add(student);
    }
    public void printSchoolDetails() {
        System.out.println("The school name is " + schoolName);
        for (Student s : arr2) {
            s.printStudentDetails();
        }
        System.out.println();
    }
	public static void main(String[] args) {
        School school = new School("GLA University");
        Student s1 = new Student("Ayush", 101);
        Student s2 = new Student("Mukul", 102);

        Course c1 = new Course("Java");
        Course c2 = new Course("DSA");

        s1.enrollCourse(c1);
        s2.enrollCourse(c2);

        school.addStudent(s1);
        school.addStudent(s2);
        school.printSchoolDetails();
    }
}