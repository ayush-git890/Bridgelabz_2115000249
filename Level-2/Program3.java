//a program that takes a year as input and outputs the Year is a Leap Year or not 
import java.util.*;
public class Program3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a year--> ");
        int y = sc.nextInt();
		
        if (y >= 1582 && leapYear(y)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
		
		sc.close();
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}