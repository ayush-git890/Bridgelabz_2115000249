package org.example;
import com.opencsv.*;
import java.io.*;
import java.util.*;
public class P7_SortCSV {
    public static void main(String[] args) {
        List<String[]> arr;
        try (CSVReader csv = new CSVReader(new FileReader("csvFile.csv"))) {
            arr = csv.readAll();
            arr.removeFirst();

            arr.sort((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));
            System.out.println("these are the top highest salary--> ");
            for (int i = 0; i < Math.min(5, arr.size()); i++)
                System.out.println(arr.get(i)[0]+" " +arr.get(i)[1]+" " +arr.get(i)[2]+" " +arr.get(i)[3]+" " +arr.get(i)[4]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}