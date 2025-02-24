package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class MyApplication {
    @ImportantMethod(level = "LOW")
    public void processPayment() {
        System.out.println("Processing payment...");
    }

    @ImportantMethod
    public void generateReport() {
        System.out.println("generating report...");
    }
    public void normalMethod() {
        System.out.println("this is normal method......");
    }
}
public class P1_AnnotationImportantMethod {
    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        Method[] arr = app.getClass().getDeclaredMethods();

        System.out.println("these are the important methods......");
        for (Method m : arr) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + "-> level----> " + annotation.level());
            }
        }
    }
}