package org.example;
import com.opencsv.*;
import java.io.*;
import java.util.*;
public class P5_SearchRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name of employee for searching purpose... ");
        String nameEmp = sc.next();
        try (CSVReader csv = new CSVReader(new FileReader("csvFile.csv"))) {
            csv.readNext(); // Skip header row
            String[] arr;
            boolean flag = false;
            while ((arr = csv.readNext()) != null) {
                if(arr[1].equals(nameEmp)) {
                    System.out.println(arr[0] + "-" + arr[1] + "-" + arr[2] + "-" + arr[3] + "-" + arr[4]);
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.println("not found....");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}