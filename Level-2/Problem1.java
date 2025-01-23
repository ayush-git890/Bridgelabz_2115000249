import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter a year 
        System.out.println("Enter a year (>= 1582):");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("The year " + year + " is not in the Gregorian calendar.");
        } else {
            System.out.println("Using multi if-else:");
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year " + year + " is a Leap Year.");
                    } else {
                        System.out.println("The year " + year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println("The year " + year + " is a Leap Year.");
                }
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }

        sc.close();
    }
}