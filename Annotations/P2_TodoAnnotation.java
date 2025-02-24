package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
class Task {
    @Todo(task = "implementing using authentication......", assignedTo = "Ayush Agarwal")
    void userAuthentication() {
        System.out.println("Authenticating user...");
    }
}
public class P2_TodoAnnotation {
    public static void main(String[] args) {
        Method[] arr = Task.class.getDeclaredMethods();

        for (Method m : arr) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo todo = m.getAnnotation(Todo.class);
                System.out.println("Task--> " + todo.task());
                System.out.println("Assigned To--> " + todo.assignedTo());
                System.out.println("Priority--> " + todo.priority());
                System.out.println();
            }
        }
    }
}