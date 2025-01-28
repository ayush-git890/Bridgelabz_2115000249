//covert km to miles......
import java.util.*;
public class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = sc.nextInt();
        switch (flag) {
            case 1:
                double km = sc.nextDouble();
                System.out.println("the miles is after conversion: " + kilometersToMiles(km));
                break;
            case 2:
                double miles = sc.nextDouble();
                System.out.println("the kilometers is : " + MilesToKm(miles));
                break;
            case 3:
                double meters = sc.nextDouble();
                System.out.println("the feet is: " + metersToFeet(meters));
                break;
            case 4:
                double feet = sc.nextDouble();
                System.out.println("Meters: " + feetToMeters(feet));
                break;
        }
		
		sc.close();
    }

    public static double kilometersToMiles(double km) {
        return km * 0.621371;
    }

    public static double MilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }
}