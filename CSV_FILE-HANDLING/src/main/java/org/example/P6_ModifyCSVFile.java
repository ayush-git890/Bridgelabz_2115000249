package org.example;
import com.opencsv.*;
import java.io.*;
import java.util.*;
public class P6_ModifyCSVFile {
    public static void main(String[] args) throws Exception {
        try (CSVReader reader = new CSVReader(new FileReader("inputCSVFile.csv"));
             CSVWriter writer = new CSVWriter(new FileWriter("outputCSVFIle.csv"))) {

            List<String[]> arr = reader.readAll();
            writer.writeNext(arr.getFirst());
            for (int i = 1; i < arr.size(); i++) {
                String[] str = arr.get(i);
                if ("IT".equalsIgnoreCase(str[2])) {
                    int salary = Integer.parseInt(str[3]);
                    str[3] = String.valueOf((int) (salary * 1.10));
                }
                writer.writeNext(str);
            }

            System.out.println("completed....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}