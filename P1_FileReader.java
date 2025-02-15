import java.io.*;
public class P1_FileReader {
    public static void main(String[] args) {
        String filePath = "temp.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fileReader);
            String str;
            // Read and print each line
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println("file found");
            br.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found sry....");
        } catch (IOException e) {
            System.out.println("there is some error in reading the file--> " + e.getMessage());
        }
    }
}