import java.io.*;
public class P1_CheckedException {
    public static void main(String[] args) {
		try(FileReader fileReader = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fileReader)){
				String str;
				while((str = br.readLine()) != null){
					System.out.println(str);
				}
			}
		catch(IOException e){
			System.out.println("here is no file related........");
		}
    }
}