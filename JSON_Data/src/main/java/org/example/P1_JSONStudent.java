package org.example;
import org.json.*;
public class P1_JSONStudent {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "Ayush Agarwal");
        student.put("age", 23);

        JSONArray arr = new JSONArray();
        arr.put("DSA");
        arr.put("Computer Science");
        arr.put("CP");
        student.put("subjects", arr);
        System.out.println("the json data is this--> ");
        System.out.println(student.toString());
    }
}