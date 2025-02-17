import java.util.*;
import java.io.*;
public class P4_LargeFileReading{
	public static void main(String args[]){
		String path = "temp.txt";
        long start, time;
        start = System.nanoTime();
        try (FileReader fr = new FileReader(path)) {
            char[] arr = new char[1024];
            while (fr.read(arr) != -1) {

            }
        }
        time = System.nanoTime() - start;
        System.out.println("FileReader Time: " + time / 1e6 + " ms");
        start = System.nanoTime();
        try (InputStreamReader irs = new InputStreamReader(new FileInputStream(path))) {
            char[] arr = new char[1024];
            while (irs.read(arr) != -1) {

            }
        }
        time = System.nanoTime() - start;
        System.out.println("InputStreamReader Time: " + time / 1e6 + " ms");
	}
}