package org.example;
import com.opencsv.*;
import java.io.*;
public class P3_ReadCoutCSVFile {
    public static void main(String[] args) {
        int c = 0;
        try (CSVReader csv = new CSVReader(new FileReader("csvFile.csv"))) {
            csv.readNext();
            while (csv.readNext() != null) {
                c++;
            }
            System.out.println("the total no. of rows are--> " + c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}