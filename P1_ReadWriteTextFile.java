import java.util.*;
import java.io.*;
public class P1_ReadWriteTextFile {
    public static void main(String[] args) {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;
        try {
            File inputFile = new File("text.txt");
            if (!inputFile.exists()) {
                System.out.println("your text.txt file does not exist....");
                return;
            }

            fileInput = new FileInputStream(inputFile);
            fileOutput = new FileOutputStream("temp.txt");

            int n;
            while ((n = fileInput.read()) != -1) {
                fileOutput.write(n);
            }

            System.out.println("file copied.....");
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        } finally {
            try {
                if (fileInput != null) fileInput.close();
                if (fileOutput != null) fileOutput.close();
            } catch (IOException e) {
                System.out.println("error in closing the files...." + e.getMessage());
            }
        }
    }
}