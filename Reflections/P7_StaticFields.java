package Reflections;
import java.lang.reflect.*;
class Configuration {
    private static String API_KEY = "AYUSH_AGARWAL";
    public static void printAPI() {
        System.out.println("the api key is--> " + API_KEY);
    }
}
public class P7_StaticFields {
    public static void main(String[] args) {
        try {
            Class<?> c = Configuration.class;
            Field f = c.getDeclaredField("API_KEY");
            Configuration.printAPI();

            f.setAccessible(true);
            f.set(null, "AYUSH");

            Configuration.printAPI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}