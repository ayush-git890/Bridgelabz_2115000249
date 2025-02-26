package org.example;
import org.json.*;
import java.util.*;
class College {
    String name;
    int age;
    String email;
    public College(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("name", this.name);
        json.put("age", this.age);
        json.put("email", this.email);
        return json;
    }
}
public class P9_ListToJSONArray {
    public static void main(String[] args) {
        List<College> arr = new ArrayList<>();
        arr.add(new College("Ayush Agarwal", 23, "ayush123@gmail.com"));

        JSONArray json = new JSONArray();
        for (College student : arr) {
            json.put(student.toJson());
        }

        System.out.println(json.toString(2));//for pretty format view....
    }
}