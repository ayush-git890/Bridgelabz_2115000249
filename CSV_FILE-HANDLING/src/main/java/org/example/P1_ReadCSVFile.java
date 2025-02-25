package org.example;
import com.opencsv.*;
import java.io.*;
public class P1_ReadCSVFile {
    public static void main(String[] args) {
        try(CSVReader csv = new CSVReader(new FileReader("csvFile.csv"))){
            String[] arr;
            while ((arr = csv.readNext()) != null){
                System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}