import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateFormat{
	public static void main(String args[]){
		LocalDate currentDate = LocalDate.now(); //to calculate current date...
		
		DateTimeFormatter a1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter a2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter a3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		
		 // format the current date in different formats
        String f1 = currentDate.format(a1);
        String f2 = currentDate.format(a2);
        String f3 = currentDate.format(a3);
		
		System.out.println("date in dd/MM/yyyy format: " + f1);
        System.out.println("date in yyyy-MM-dd format: " + f2);
        System.out.println("date in EEE, MMM dd, yyyy format: " + f3);
	}
}