import java.util.*;
import java.io.*;
public class P3_ReadUserInput {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try (FileWriter fw = new FileWriter("temp.txt", true)) {
            System.out.print("enter  name-->  ");
            String name = br.readLine();
            
            System.out.print("enter age-->  ");
            String age = br.readLine();
            
            System.out.print("enter programming language: ");
            String lang = br.readLine();
            
            fw.write("Name--> " + name + "\n");
            fw.write("Age--> " + age + "\n");
            fw.write("Favorite Programming Language--> " + lang + "\n");
            fw.write("-----------------------------------------\n");
            
            System.out.println("info saved....... " + "temp.txt");
        } catch (IOException e) {
            System.out.println("this is an error......." + e.getMessage());
        }
    }
}