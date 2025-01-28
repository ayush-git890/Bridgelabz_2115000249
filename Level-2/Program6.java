//fahrenheit to celsius......
import java.util.*;
public class Program6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch (op) {
            case 1:
				System.out.println("enter fahrenheit;-> ");
                double fahrenheit = sc.nextDouble();
                System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
				System.out.println("enter celsius;-> ");
                double celsius = sc.nextDouble();
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
            case 3:
				System.out.println("enter Kilograms;-> ");
                double pounds = sc.nextDouble();
                System.out.println("Kilograms: " + poundsToKilograms(pounds));
                break;
            case 4:
				System.out.println("enter Pounds;-> ");
                double kilograms = sc.nextDouble();
                System.out.println("Pounds: " + kilogramsToPounds(kilograms));
                break;
            case 5:
				System.out.println("enter gallons;-> ");
                double gallons = sc.nextDouble();
                System.out.println("Liters: " + gallonsToLiters(gallons));
                break;
            case 6:
				System.out.println("enter liters;-> ");
                double liters = sc.nextDouble();
                System.out.println("Gallons: " + litersToGallons(liters));
                break;
        }
		
		sc.close();
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKilograms(double p) {
        return p * 0.453592;
    }

    public static double kilogramsToPounds(double k) {
        return k * 2.20462;
    }

    public static double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double litersToGallons(double lit) {
        return lit * 0.264172;
    }
}