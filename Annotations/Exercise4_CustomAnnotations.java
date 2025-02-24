package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = "high", assignedTo = "ayush agarwal")
    public void completeTask() {
        System.out.println("task is completed......");
    }
}
public class Exercise4_CustomAnnotations {
    public static void main(String[] args) throws Exception {
        TaskManager t = new TaskManager();
        Method m = t.getClass().getMethod("completeTask");

        if (m.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo annotation = m.getAnnotation(TaskInfo.class);
            System.out.println("priority-> " + annotation.priority());
            System.out.println("assigned to-> " + annotation.assignedTo());
        }

        t.completeTask();
    }
}