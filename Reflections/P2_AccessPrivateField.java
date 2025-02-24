package Reflections;
import java.lang.reflect.*;
class Person {
    private int age = 23;
    public void getAge() {
        System.out.println("now your current age of your's is--> " + age);
    }
}
public class P2_AccessPrivateField{
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.getAge();
        Class<?> c = p.getClass();
        Field f = c.getDeclaredField("age");
        f.setAccessible(true); 

        int old_Age = (int)f.get(p);
        System.out.println("the old age is-> " + old_Age);
        f.set(p, 25);
        int new_Age = (int)f.get(p);
        System.out.println("the new age is-> " + new_Age);
        p.getAge();
    }
}