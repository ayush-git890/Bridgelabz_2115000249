import java.io.*;
import java.util.*;
public class P2_FileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path here--> : ");
        String path = sc.nextLine();
        System.out.print("Enter the word to count here--> ");
        String str = sc.next();
        int c = 0;

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader br = new BufferedReader(fileReader);
            String st2;
            while ((st2 = br.readLine()) != null) {
                String[] words = st2.split("\\W+"); // Splits on non-word characters
                for (String word : words) {
                    if (word.equalsIgnoreCase(str)) {
                        c++;
                    }
                }
            }

            br.close();
            fileReader.close();

            System.out.println("The word '" + str + "' comes " + c + " times");

        } catch (FileNotFoundException e) {
            System.out.println("file not found here....");
        } catch (IOException e) {
            System.out.println("we issuing some error in file--> " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}