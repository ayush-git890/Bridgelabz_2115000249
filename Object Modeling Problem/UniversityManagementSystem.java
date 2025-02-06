import java.util.*;
class Course {// this is our course class
    private String courseName;
    private Professor professor;
    private List<Student> arr;

    public Course(String courseName) {
        this.courseName = courseName;
        this.arr = new ArrayList<>();
    }
    public String getCourseName() {
        return courseName;
    }
    public void assignProfessor(Professor professor) { // assigning a professor
        this.professor = professor;
        System.out.println(professor.getProfessorName() + " has been assigned to teach " + courseName);
    }
    public void enrollStudent(Student student) { // enrolling a student
        arr.add(student);
        System.out.println(student.getStudentName() + " has enrolled in " + courseName);
    }
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getProfessorName());
        } else {
            System.out.println("!!error!! here");
        }
        System.out.println("Enrolled Students:");
        for (Student s : arr) {
            System.out.println("-> " + s.getStudentName());
        }
        System.out.println();
    }
}
class Professor { // Professor class
    private String professorName;
    private List<Course> arr;

    public Professor(String professorName) {
        this.professorName = professorName;
        this.arr = new ArrayList<>();
    }
    public String getProfessorName() {
        return professorName;
    }
    public void teachCourse(Course course) { // assigning professor to a course
        arr.add(course);
        course.assignProfessor(this);
    }
}
class Student { // Student class
    private String studentName;
    private List<Course> arr;

    public Student(String studentName) {
        this.studentName = studentName;
        this.arr = new ArrayList<>();
    }
    public String getStudentName() {
        return studentName;
    }
    public void enrollCourse(Course course) { // student enrolls in a course
        arr.add(course);
        course.enrollStudent(this);
    }
}
public class UniversityManagementSystem{
	public static void main(String[] args) {
        // Creating professors
        Professor p1 = new Professor("Monu Kumar");
        Professor p2 = new Professor("Pawan Kumar");
        // Creating students
        Student s1 = new Student("Ayush Agarwal");
        Student s2 = new Student("Aditya Chauhan");
        // Creating courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Machine Learning");
        // Assigning professors to courses
        p1.teachCourse(c1);
        p2.teachCourse(c2);
        // Students enrolling in courses
        s1.enrollCourse(c1);
        s2.enrollCourse(c2);
        // Viewing details
        System.out.println("\nUniversity Course details--> ");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}