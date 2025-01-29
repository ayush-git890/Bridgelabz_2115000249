import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class ArithmeticDate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// Date format to match the input format
        DateTimeFormatter flag = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		System.out.println("enter a date in the form of yyyy-MM-dd: ");
        String str = sc.nextLine();
		LocalDate date = LocalDate.parse(str, flag);
		
		LocalDate ans = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3); 
				
		System.out.println("hece after calculation the result is--> " + ans);
	}
}