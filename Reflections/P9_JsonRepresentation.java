package Reflections;
import java.lang.reflect.*;
class Product {
    public String name = "Mobile";
    public double price = 10000.0;
}
public class P9_JsonRepresentation {
    public static String json(Object obj) throws Exception {
        Class<?> c = obj.getClass();
        StringBuilder json = new StringBuilder("{");
        for (Field f : c.getDeclaredFields()) {
            f.setAccessible(true);
            json.append("\"").append(f.getName()).append("\":\"").append(f.get(obj)).append("\",");
        }
        return json.substring(0, json.length() - 1) + "}";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(json(new Product()));
    }
}