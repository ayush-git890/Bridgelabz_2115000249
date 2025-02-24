package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}
class User {
    @JsonField(name = "user_name")
    private String username;
    
    @JsonField(name = "user_age")
    private int age;
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
public class P6_JsonField {
    public static void main(String[] args) {
        User u = new User("Ayush Agarwal", 23);
        String json = toJson(u);
        System.out.println(json);
    }
    static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");
        Field[] arr = obj.getClass().getDeclaredFields();

        for (int i = 0; i < arr.length; i++) {
            Field f = arr[i];
            if (f.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = f.getAnnotation(JsonField.class);
                String key = annotation.name();
                f.setAccessible(true);
                try {
                    Object v = f.get(obj);
                    json.append("\"").append(key).append("\":\"").append(v).append("\"");
                    if (i < arr.length - 1) {
                        json.append(", ");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        json.append("}");
        return json.toString();
    }
}