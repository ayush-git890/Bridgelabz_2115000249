package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.*;

public class P15_JSONFromDatabase{
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/Bridgelabz_21150000249";
        String user = "ayush";
        String pass = "ayush@123@123";
        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement stmt = con.createStatement();
             ResultSet set = stmt.executeQuery("SELECT * FROM employees")) {

            JSONArray arr = new JSONArray();
            while (set.next()) {
                JSONObject obj = new JSONObject();
                obj.put("id", set.getInt("id"));
                obj.put("name", set.getString("name"));
                obj.put("department", set.getString("department"));
                obj.put("salary", set.getInt("salary"));
                arr.put(obj);
            }
            System.out.println("here is our result.........");
            System.out.println(arr);
        }
    }
}