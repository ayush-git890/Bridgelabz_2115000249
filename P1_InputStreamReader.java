import java.io.*;
public class P1_InputStreamReader {
    public static void main(String[] args) {
        String filePath = "temp.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            BufferedReader br = new BufferedReader(inputStreamReader);
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

            br.close();
            inputStreamReader.close();
            fileInputStream.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("file not found here....");
        } catch (IOException e) {
            System.out.println("we issuing some error in file--> " + e.getMessage());
        }
    }
}