//convert yards to feet.........
import java.util.*;
public class Program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch (op) {
            case 1:
				System.out.println("enter yards;-> ");
                double yards = sc.nextDouble();
                System.out.println("Feets: " + yardsToFeets(yards));
                break;
            case 2:
				System.out.println("enter feets;-> ");
                double feets = sc.nextDouble();
                System.out.println("Yards: " + feetsToYards(feets));
                break;
            case 3:
				System.out.println("enter meters;-> ");
                double meters = sc.nextDouble();
                System.out.println("Inches: " + metersToInches(meters));
                break;
            case 4:
				System.out.println("enter inches;-> ");
                double inches = sc.nextDouble();
                System.out.println("Meters: " + inchesToMeters(inches));
                break;
            case 5:
                inches = sc.nextDouble();
                System.out.println("Centimeters: " + inchesToCentimeters(inches));
                break;
        }
		
		sc.close();
    }

    public static double yardsToFeets(double yards) {
        return yards * 3;
    }

    public static double feetsToYards(double feets) {
        return feets * 0.333333;
    }

    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }
}