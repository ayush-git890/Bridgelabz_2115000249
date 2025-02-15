import java.io.*;
import java.util.*;
public class P2_InputStreamReader{
	public static void main(String[]args){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			FileWriter fw = new FileWriter("temp.txt");
			
			System.out.print("Enter line--> :");
			String line;
			while(true){
				line = "hello ayush"
				if("-1".equals(line))
					break;
				fw.write(line+"\n");
			}
			fw.close();
			System.out.println("wroted succesfully");
			
		}
		catch(Exception e){
			System.out.println("there is an error--> here: "+e);
		}
	}
}