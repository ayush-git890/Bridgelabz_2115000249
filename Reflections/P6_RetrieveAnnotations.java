package Reflections;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "Ayush Agarwal")
class TempClass{
    public void print() {
        System.out.println("it is our temporary class....");
    }
}
public class P6_RetrieveAnnotations {
    public static void main(String[] args) {
        try {
            Class<?> c = TempClass.class;
            if (c.isAnnotationPresent(Author.class)) {
                Author author = c.getAnnotation(Author.class);

                System.out.println("the name of author is--> " + author.name());
            } else {
                System.out.println("there is no @Author.....");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}