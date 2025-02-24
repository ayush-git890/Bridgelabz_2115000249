package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Logger {
    @LogExecutionTime
    void fastMethod() {
        for (int i = 0; i < 1000; i++);
    }

    @LogExecutionTime
    void slowMethod() {
        for (int i = 0; i < 1000000; i++);
    }
}
public class P3_LoggingMethodExecution {
    public static void main(String[] args) throws Exception{
        Logger o = new Logger();
        Method[] arr = Logger.class.getDeclaredMethods();

        for (Method m : arr) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long initial = System.nanoTime();
                m.invoke(o);
                long end = System.nanoTime();
                System.out.println("the execution time of-> " + m.getName() + " is " + (end - initial) + " ns");
            }
        }
    }
}