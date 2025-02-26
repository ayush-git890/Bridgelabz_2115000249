package org.example;
import org.json.*;
public class P7_ParseJSONFile {
    public static void main(String[] args) {
        String st = "[{\"name\":\"Ayush\",\"age\":23},{\"name\":\"Rohit\",\"age\":32}]";
        JSONArray json = new JSONArray(st);
        JSONArray arr = new JSONArray();

        for (int i = 0; i < json.length(); i++) {
            JSONObject obj = json.getJSONObject(i);
            if (obj.getInt("age") > 25) {
                arr.put(obj);
            }
        }
        System.out.println("here we get the data---> ");
        System.out.println(arr);
    }
}