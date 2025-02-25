package org.example;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvBindByPosition;
import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.*;

public class P14_JSONToCSV {
    public static void toCSV(String currentPath, String destinationPath) throws Exception{
        ObjectMapper om = new ObjectMapper();
        List<helper> arr = Arrays.asList(om.readValue(new File(currentPath), helper[].class));
        try(Writer wr = new FileWriter(destinationPath);
            CSVWriter csv = new CSVWriter(wr)){
            csv.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});

            for (helper s : arr) {
                csv.writeNext(new String[]{
                        String.valueOf(s.getId()),
                        s.getName(),
                        String.valueOf(s.getAge()),
                        String.valueOf(s.getMarks()),
                        s.getGrade()
                });
            }
        }
        System.out.println(".................");
    }
    public static void toJSON(String currentPath, String destinationPath) throws Exception{
        try(Reader rd = new FileReader(currentPath);
            CSVReader csv = new CSVReader(rd)){
            List<helper> students = new ArrayList<>();
            csv.readNext();
            String[] arr;
            while((arr = csv.readNext()) != null){
                students.add(new helper(
                        Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]),
                        Integer.parseInt(arr[3]), arr[4]
                ));
            }

            ObjectMapper om = new ObjectMapper();
            om.writerWithDefaultPrettyPrinter().writeValue(new File(destinationPath), students);
        }
        System.out.println("...............");
    }
    public static void main(String[] args) throws Exception {
        toCSV("StudentJSON.json","StudentCSV.csv");
        toJSON("StudentCSV.csv","StudentJSON.json");
    }
}
class helper{
    @CsvBindByPosition(position = 0) private int id;
    @CsvBindByPosition(position = 1) private String name;
    @CsvBindByPosition(position = 2) private int age;
    @CsvBindByPosition(position = 3) private int marks;
    @CsvBindByPosition(position = 4) private String grade;

    public helper() {}
    public helper(int id, String name, int age, int marks, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getMarks() { return marks; }
    public String getGrade() { return grade; }
}