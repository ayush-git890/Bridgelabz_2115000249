package Reflections;
import java.lang.reflect.*;
class Student {
    private String name;
    public Student() {
        this.name = "Ayush Agarwal";
    }
    public Student(String name) {
        this.name = name;
    }
    public void get() {
        System.out.println("the student name is-> " + name);
    }
}
public class P4_DynamicallyCreateObject {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("Reflections.Student");
            Constructor<?> cons = c.getDeclaredConstructor();
            Object o = cons.newInstance();

            Student st = (Student)o;
            st.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}