package org.example;
import org.json.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class P8_PrintKeysValues {
    public static void main(String[] args) {
        try {
            String st = new String(Files.readAllBytes(Paths.get("sampleJson.json")));
            JSONArray json = new JSONArray(st);
            for (int i = 0; i < json.length(); i++) {
                JSONObject obj = json.getJSONObject(i);
                System.out.println("the record-> " + (i + 1) + ":");

                Iterator<String> k = obj.keys();
                while (k.hasNext()) {
                    String key = k.next();
                    System.out.println(key + " -- " + obj.get(key));
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println("there is an error in this--> " + e.getMessage());
        }
    }
}