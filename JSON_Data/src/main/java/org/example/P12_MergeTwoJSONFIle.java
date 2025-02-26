package org.example;
import org.json.*;
public class P12_MergeTwoJSONFIle{
    public static void main(String[] args) {
        JSONObject json1 = new JSONObject();
        json1.put("name", "Ayush Agarwal");
        json1.put("age", 23);

        JSONObject json2 = new JSONObject();
        json2.put("email", "ayush123@gmail.com");
        json2.put("city", "agra");

        JSONObject m = new JSONObject(json1, JSONObject.getNames(json1));
        for (String key : JSONObject.getNames(json2)) {
            m.put(key, json2.get(key));
        }

        System.out.println("hence it is our merged json data---> ");
        System.out.println(m.toString(2));
    }
}