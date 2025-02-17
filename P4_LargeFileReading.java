import java.util.*;
import java.io.*;
public class P4_LargeFileReading{
	public static void main(String args[]){
		String path = "temp.txt";
        long start, time;
        start = System.nanoTime();
        try (FileReader fileReader = new FileReader(path)) {
            char[] arr = new char[1024];
            while (fileReader.read(arr) != -1) {

            }
        }
        time = System.nanoTime() - start;
        System.out.println("FileReader Time: " + time / 1e6 + " ms");
        start = System.nanoTime();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path))) {
            char[] arr = new char[1024];
            while (inputStreamReader.read(arr) != -1) {

            }
        }
        time = System.nanoTime() - start;
        System.out.println("InputStreamReader Time: " + time / 1e6 + " ms");
	}
}