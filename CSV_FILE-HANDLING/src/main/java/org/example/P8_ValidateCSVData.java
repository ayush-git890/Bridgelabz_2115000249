package org.example;
import com.opencsv.*;
import java.io.*;
import java.util.regex.*;
public class P8_ValidateCSVData {
    public static void main(String[] args) {
        Pattern patternEmail = Pattern.compile("^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$");
        Pattern patternPhone = Pattern.compile("^\\d{10}$");
        try (CSVReader csv = new CSVReader(new FileReader("fileCSV.csv"))) {
            csv.readNext(); // Skip header
            String[] arr;
            while ((arr = csv.readNext()) != null) {
                String e = arr[5];
                String p = arr[6];

                if (!patternEmail.matcher(e).matches())
                    System.out.println("this is invalid mail--> " + e);

                if (!patternPhone.matcher(p).matches())
                    System.out.println("this is invalid phone--> " + p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}