import java.util.*;
public class P3_UniversityCourseSystem{
    public static void main(String[] args) {
        CourseCatalog<ExamCourse> exam = new CourseCatalog<>();
        exam.addCourse(new ExamCourse("dsa"));
        exam.addCourse(new ExamCourse("graph"));
        exam.addCourse(new ExamCourse("dp"));
        CourseCatalog.displayCourses(exam.getCourses());

        CourseCatalog<AssignmentCourse> assignmentCourses = new CourseCatalog<>();
        assignmentCourses.addCourse(new AssignmentCourse("Data Structures & Algorithms"));
        assignmentCourses.addCourse(new AssignmentCourse("Image Processing"));
        CourseCatalog.displayCourses(assignmentCourses.getCourses());

        CourseCatalog<ResearchCourse> researchCourses = new CourseCatalog<>();
        researchCourses.addCourse(new ResearchCourse("NLP"));
        researchCourses.addCourse(new ResearchCourse("ML"));
        CourseCatalog.displayCourses(researchCourses.getCourses());
    }
}
abstract class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
}
class ExamCourse extends Course {
    public ExamCourse(String courseName) {
        super(courseName);
    }
}
class AssignmentCourse extends Course {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
}
class ResearchCourse extends Course {
    public ResearchCourse(String courseName) {
        super(courseName);
    }
}
class CourseCatalog<T extends Course> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    public static void displayCourses(List<? extends Course> courses) {
        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName());
        }
    }
}