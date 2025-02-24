package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User{
    @MaxLength(12)
    private String username;

    User(String username) {
        maxLength(username);
        this.username = username;
    }
    private void maxLength(String str) {
        try {
            Field field = User.class.getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if (str.length() > maxLength) {
                    throw new IllegalArgumentException("the length of username is exceeded" + maxLength);
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    String getUsername() {
        return username;
    }
}
public class P4_MaxLength {
    public static void main(String[] args) {
        try {
            User s1 = new User("Ayush");
            System.out.println("the valid username is--> " + s1.getUsername());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}