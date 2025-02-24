package Reflections;
import java.lang.reflect.*;
class Task {
    public void runTask() {
        for (int i = 0; i < 1000000; i++);
    }
}
public class P12_MethodExecutionTime {
    public static void main(String[] args) throws Exception {
        Task t = new Task();
        Method m = Task.class.getMethod("runTask");

        long initaiTime = System.nanoTime();
        m.invoke(t);
        long finalTime = System.nanoTime();

        System.out.println("the execution time is-> " + (finalTime - initaiTime) + " ns");
    }
}