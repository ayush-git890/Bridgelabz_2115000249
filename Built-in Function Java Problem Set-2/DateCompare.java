import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateCompare{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		 DateTimeFormatter flag = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 
		System.out.println("enter the first date in the form of yyyy-mm-dd: ");
        String str1 = sc.nextLine();
        System.out.println("enter the second date in the form of yyyy-mm-dd: ");
        String str2 = sc.nextLine();
		//LocalDate objects
        LocalDate d1 = LocalDate.parse(str1, flag);
        LocalDate d2 = LocalDate.parse(str2, flag);
		if (d1.isBefore(d2)) {
            System.out.println(d1 + " is before " + d2);
        } 
		else if (d1.isAfter(d2)) {
            System.out.println(d1 + " is after " + d2);
        } 
		else if (d1.isEqual(d2)) {
            System.out.println(d1 + " is the same as " + d2);
        }
	}
}