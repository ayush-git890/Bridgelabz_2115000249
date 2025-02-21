import java.util.*;
import java.io.*;
public class P9_LargeFIleLineByLine {
    public static void main(String[] args) {
        String file = "tempLargeFile.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null) {
                if (str.toLowerCase().contains("....error....")) {
                    System.out.println(str);
                }
            }
        } catch (IOException e) {
            System.out.println("there is an error here--> " + e.getMessage());
        }
    }
}