package org.example;
import org.json.*;
import java.nio.file.*;
public class P11_ValidateAnEmail {
    public static void main(String[] args) throws Exception {
        String st = new String(Files.readAllBytes(Paths.get("smapleJson.json")));
        JSONArray arr = new JSONArray(st);
        JSONObject json = arr.getJSONObject(0);
        System.out.println(isValidEmail(json)?"email is valid...":"invalid");
    }
    static boolean isValidEmail(JSONObject json) {
        String e = json.getString("email");
        return e.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}