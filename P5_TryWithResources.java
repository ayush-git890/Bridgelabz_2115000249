import java.io.*;
public class P5_TryWithResources {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("info.txt"))){
            String str = br.readLine();
            if(str != null)
                System.out.println(str);
        }
        catch (IOException e) {
            System.out.println("there is an error occur while reading the file....");
        }
    }
}