import java.util.*;
import java.io.*;
import java.nio.file.*;
public class P5_ByteArrayStream {
    public static void main(String[] args) {
        try {
            byte[] imageBytes = Files.readAllBytes(new File("input.jpg").toPath());// Convert image to byte array
            
            try (ByteArrayInputStream byteInput = new ByteArrayInputStream(imageBytes); // Convert byte array back to image
                 FileOutputStream fileOutput = new FileOutputStream("output.jpg")) {
                
                byte[] arr = new byte[4096];
                int n;
                while ((n = byteInput.read(arr)) != -1) {
                    fileOutput.write(arr, 0, n);
                }
            }
            
            System.out.println("image is converted....");
        } catch (IOException e) {
            System.out.println("there is an error--> " + e.getMessage());
        }
    }
}