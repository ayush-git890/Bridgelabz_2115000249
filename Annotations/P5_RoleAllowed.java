package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class User {
    private String role;
    User(String role) {
        this.role = role;
    }

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted!");
    }
    public String getRole() {
        return role;
    }
}

public class P5_RoleAllowed {
    public static void main(String[] args) throws Exception {
        User admin = new User("ADMIN");
        User nonAdmin = new User("USER");
        executeMethod(admin, "deleteUser");
        executeMethod(nonAdmin, "deleteUser");
    }

    static void executeMethod(User service, String name) throws Exception {
        Method m = User.class.getMethod(name);
        if (m.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed ra = m.getAnnotation(RoleAllowed.class);
            String ar = ra.value();

            if (service.getRole().equals(ar)) {
                m.invoke(service);
            } else {
                System.out.println("Access Denied!");
            }
        } else {
            m.invoke(service);
        }
    }
}