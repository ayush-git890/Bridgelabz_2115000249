package Reflections;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}

class Service {
    public void serve() {
        System.out.println("server is running.............");
    }
}
class Client {
    @Inject
    private Service service;
    public void execute() {
        service.serve();
    }
}
public class P11_DependencyInjection {
    public static void main(String[] args) throws Exception {
        Client c = new Client();
        for (Field f : Client.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(c, new Service());
            }
        }
        c.execute();
    }
}