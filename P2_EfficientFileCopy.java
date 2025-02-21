import java.util.*;
import java.io.*;
public class P2_EfficientFileCopy {
    public static void main(String[] args) {
        long bufferedTime = copyBuffered("tempLarge.txt", "buffered_copy.txt");
        long fileTime = copyNormalFile("tempLarge.txt", "filr_copy.txt");
        
        System.out.println("Buffered--Stream Time---> " + bufferedTime + " ns");
        System.out.println("file--Stream Time---> " + fileTime + " ns");
    }
    public static long copyBuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bufferInput = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bufferOutput = new BufferedOutputStream(new FileOutputStream(destination))) {
            
            byte[] arr = new byte[4096];
            int n;
            while ((n = bufferInput.read(arr)) != -1) {
                bufferOutput.write(arr, 0, n);
            }
        } catch (IOException e) {
            System.out.println("there is an error---> " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
    public static long copyNormalFile(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fileInput = new FileInputStream(source);
            FileOutputStream fileOutput = new FileOutputStream(destination)) {
            
            int n;
            while ((n = fileInput.read()) != -1) {
                fileOutput.write(n);
            }
        } catch (IOException e) {
            System.out.println("there is an error---> " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}