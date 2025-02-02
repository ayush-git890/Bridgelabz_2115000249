import java.util.*;
class Course {
    private String courseName;
    private int duration; // in weeks
    private double fee;
    private static String instituteName = "Ayush Academy";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("institute name--> " + instituteName);
        System.out.println("course--> " + courseName);
        System.out.println("time period--> " + duration + " weeks");
        System.out.println("fee--> " + fee);
    }
    //updated clss instance
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
public class OnlineCourseManagement{
	public static void main(String args[]){
		Course c1 = new Course("Java", 10, 10000);
        Course c2 = new Course("DSA", 12, 20000);
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("Ayush Series.......");

        System.out.println("after institute name updated:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
	}
}