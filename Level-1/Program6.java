//program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”
import java.util.*;
public class Program6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter a day--> ");
        int day = sc.nextInt();
		System.out.println("enter a month--> ");
        int month = sc.nextInt();
        System.out.println("here is our answer---> "+springSeason(day, month));
		
		sc.close();
    }
    public static boolean springSeason(int day, int month) {
		
		//checking the condition....
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        } else if (month == 4 && day >= 1 && day <= 30) {
            return true;
        } else if (month == 5 && day >= 1 && day <= 31) {
            return true;
        } else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        return false;
    }
}