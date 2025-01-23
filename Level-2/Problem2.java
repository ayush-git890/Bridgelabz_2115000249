import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter a year 
        System.out.println("Enter a year (>= 1582):");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("The year " + year + " is not in the Gregorian calendar.");
        } else {
            //Using a single if statement with logical operators
            System.out.println("\nUsing single if statement:");
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }

        sc.close();
    }
}