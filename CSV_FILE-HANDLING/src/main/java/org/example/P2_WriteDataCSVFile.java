package org.example;
import com.opencsv.*;
import java.io.*;
public class P2_WriteDataCSVFile {
    public static void main(String[] args) {
        try (CSVWriter csv = new CSVWriter(new FileWriter("csvFile.csv"))) {
            String[] head = {"ID", "Name", "Department", "Salary"};
            csv.writeNext(head);
            String[][] arr = {
                    {"1111", "Ayush", "CS", "100000"},
                    {"2222", "Mohit", "IT", "40000"},
                    {"3333", "Rohit", "MANAGER", "60000"},
                    {"4444", "SOHIT", "Sale", "50000"}
            };
            for (String[] d : arr) {
                csv.writeNext(d);
            }

            System.out.println("file writtened done.....");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}