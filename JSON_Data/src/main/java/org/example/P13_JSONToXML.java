package org.example;
import org.json.*;
import java.nio.file.*;
public class P13_JSONToXML {
    public static void main(String[] args) {
        try {
            String st = new String(Files.readAllBytes(Paths.get("sampleJson.json")));
            JSONObject json = new JSONObject(st);
            String xmlContent = XML.toString(json, "root");

            System.out.println("here we have our converted xml---> " + xmlContent);

        } catch (Exception e) {
            System.err.println("there is an error here--> " + e.getMessage());
        }
    }
}