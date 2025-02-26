package org.example;
import org.json.*;
import java.io.*;
import java.nio.file.*;
public class P3_ExtractSpecificField {
    public static void main(String[] args) {
        try {
            String st = new String(Files.readAllBytes(Paths.get("sampleJson.json")));
            JSONObject json = new JSONObject(st);

            String name = json.getString("name");
            String email = json.getString("email");

            System.out.println("the name is-->  " + name);
            System.out.println("the mail is--> " + email);
        } catch (IOException e) {
            System.err.println("there is an error--> " + e.getMessage());
        }
    }
}