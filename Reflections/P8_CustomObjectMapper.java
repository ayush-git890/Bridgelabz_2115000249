package Reflections;
import java.lang.reflect.*;
import java.util.*;
class User {
    public String name;
    public int age;
}
public class P8_CustomObjectMapper {
    public static <T> T toObject(Class<T> c, Map<String, Object> hm) throws Exception {
        T obj = c.getDeclaredConstructor().newInstance();
        for (Field field : c.getDeclaredFields()) {
            if (hm.containsKey(field.getName())) {
                field.setAccessible(true);
                field.set(obj, hm.get(field.getName()));
            }
        }
        return obj;
    }
    public static void main(String[] args) throws Exception {
        Map<String, Object> hm = new HashMap<>();
        hm.put("name", "ayush");
        hm.put("age", 23);

        User u1 = toObject(User.class, hm);
        System.out.println(u1.name + "<==>" + u1.age);
    }
}