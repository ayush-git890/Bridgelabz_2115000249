package org.example;
import com.opencsv.*;
import com.opencsv.bean.*;
import java.io.*;
import java.util.*;
public class P9_ConvertCSVToObject {
    public static void main(String[] args) {
        try (FileReader csv = new FileReader("csvFile.csv")) {
            CsvToBean<Student> ctb = new CsvToBeanBuilder<Student>(csv)
                    .withType(Student.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withSkipLines(1)
                    .build();

            List<Student> arr = ctb.parse();
            arr.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}