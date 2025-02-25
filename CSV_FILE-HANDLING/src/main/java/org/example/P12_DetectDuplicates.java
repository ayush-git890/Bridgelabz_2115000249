package org.example;
import com.opencsv.*;
import java.io.*;
import java.util.*;
public class P12_DetectDuplicates {
    public static void main(String[] args) throws Exception{
        HashSet<String> hs = new HashSet<>();
        try(CSVReader csv = new CSVReader(new FileReader("csvFile.csv"))){
            csv.readNext();
            for(String[] s : csv.readAll()) {
                if (hs.contains(s[0]))
                    System.out.println(s[0] + " " + s[1] + " " + s[2]);
                hs.add(s[0]);
            }
        }
    }
}