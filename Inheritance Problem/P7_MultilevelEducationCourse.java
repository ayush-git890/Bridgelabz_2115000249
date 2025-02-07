import java.util.*;
class Course {
    protected String courseName;
    protected int duration;
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks.");
    }
}
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Online Course: " + courseName + " (Platform: " + platform + "), Duration: " + duration + " weeks, Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // in percentage
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("Paid Online Course: " + courseName + " (Platform: " + platform + "), Duration: " + duration + " weeks, Recorded: " + (isRecorded ? "Yes" : "No") +", Fee: " + fee + ", Discount: " + discount + "%, Final Fee: " + getFinalFee());
    }
}
public class P7_MultilevelEducationCourse{
	public static void main(String args[]){
		Course basicCourse = new Course("dsa", 18);
        OnlineCourse onlineCourse = new OnlineCourse("webd", 15, "telusko", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("ml", 5, "coding blocks", true, 10000, 78);

        Course[] courses = {basicCourse, onlineCourse, paidCourse};

        for (Course course : courses) {
            course.displayCourseInfo();
            System.out.println();
        }
	}
}