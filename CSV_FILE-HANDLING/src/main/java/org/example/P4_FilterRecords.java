package org.example;
import com.opencsv.*;
import java.io.*;
public class P4_FilterRecords{
    public static void main(String[] args) {
        try (CSVReader csv = new CSVReader(new FileReader("csvFile.csv"))) {
            csv.readNext();
            String[] arr;
            while ((arr = csv.readNext()) != null) {
                if(Integer.parseInt(arr[4])>=80)
                    System.out.println(arr[0]+" - "+arr[1]+" - "+arr[2]+" - "+arr[3]+" - "+arr[4]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}