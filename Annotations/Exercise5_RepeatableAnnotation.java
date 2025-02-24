package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class BugTracker {
    @BugReport(description = "null pointer exception.....")
    @BugReport(description = "large dataset problem....")
    public void process() {
        System.out.println("Processing task...");
    }
}

public class Exercise5_RepeatableAnnotation {
    public static void main(String[] args) throws Exception {
        Method m = BugTracker.class.getMethod("process");
        BugReports br = m.getAnnotation(BugReports.class);
        if (br != null) {
            for (BugReport b : br.value()) {
                System.out.println("Bug Report---> " + b.description());
            }
        }
    }
}