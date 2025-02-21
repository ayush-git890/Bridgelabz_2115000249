import java.util.*;
import java.io.*;
public class P6_FilterStreams {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            
            String str;
            while ((str = reader.readLine()) != null) {
                writer.write(str.toLowerCase());
                writer.newLine();
            }
            
            System.out.println("file conversion is done now...." + "output.txt");
        } catch (IOException e) {
            System.out.println("there is an error--> " + e.getMessage());
        }
    }
}