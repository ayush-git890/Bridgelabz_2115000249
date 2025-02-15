import java.io.*;
public class ChallengeProblemInputStream{
    public static void compareStringBuildersAndStringBuffer() {
        int time = 1_000_000;
        String str = "Ayush";

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < time; i++)
            sb.append(str);
        long endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime));

        startTime = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < time; i++)
            sf.append(str);
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime));
    }

    public static void compareFileReadersInputStreamReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount1 = countWordsUsingFileReader(filePath);
        long endTime = System.nanoTime();
        System.out.println("FileReader Word Count: " + wordCount1);
        System.out.println("FileReader Time: " + (endTime - startTime));

        startTime = System.nanoTime();
        int wordCount2 = countWordsUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader Word Count: " + wordCount2);
        System.out.println("InputStreamReader Time: " + (endTime - startTime));
    }

    public static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return wordCount;
    }

    public static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return wordCount;
    }

    public static void main(String[] args) {
        compareStringBuildersAndStringBuffer();
        compareFileReadersInputStreamReader("temp.txt");
    }
}