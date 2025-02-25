package org.example;
import com.opencsv.*;
import java.io.*;
import java.util.*;
public class P11_ReadLargeCSV {
    public static void main(String[] args) throws Exception{
        int size = 100;
        int c = 0;
        try (CSVReader csv = new CSVReader(new FileReader("fileCSV.csv"))) {
            csv.readNext();
            String[] arr;
            int c1 = 0;

            while ((arr = csv.readNext()) != null) {
                c++;
                c1++;
                System.out.println("ID=" + arr[0] + ", Name=" + arr[1]);
                if (c1 == size) {
                    System.out.println("processed " + size + " records...");
                    c1 = 0;
                }
            }
            System.out.println("Total records processed: " + c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}