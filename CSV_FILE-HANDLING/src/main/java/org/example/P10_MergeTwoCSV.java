package org.example;
import com.opencsv.*;
import java.io.*;
import java.util.*;
public class P10_MergeTwoCSV {
    public static void main(String[] args) throws Exception {
        HashMap<String, String[]> hm = new HashMap<>();
        try(CSVReader csv = new CSVReader(new FileReader("students1.csv"))){
            csv.readNext();
            for(String[] s: csv.readAll())
                hm.put(s[0],s);
        }
        try(CSVReader csv = new CSVReader(new FileReader("students2.csv"))){
            csv.readNext();
            for(String[] s: csv.readAll())
                if(hm.containsKey(s[0]))
                    hm.put(s[0], new String[]{s[0],hm.get(s[0])[1], hm.get(s[0])[2], s[1], s[2]});
        }
        try(CSVWriter csv = new CSVWriter(new FileWriter("MergedFiled.csv"))){
            csv.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});
            for(String[] s : hm.values())
                csv.writeNext(s);
        }
        System.out.println("completed.....");
    }
}