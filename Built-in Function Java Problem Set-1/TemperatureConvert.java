import java.util.*;
public class TemperatureConvert{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("to convert f into celsius take 1--> ");
        System.out.println("to convert celsius into f take 2--> ");
        System.out.print("enetr any of the choice that you want--> ");
        int flag = sc.nextInt();

        if (flag == 1) {
            System.out.print("enter temp. in Fahrenheit: ");
            double f = sc.nextDouble();
            double c = fahrenheitToCelsius(f);
            System.out.println(c + "°C");
        } else if (flag == 2) {
            System.out.print("enter temp. in Celsius: ");
            double c = sc.nextDouble();
            double f = celsiusToFahrenheit(c);
            System.out.println(f + "°F");
        } else {
            System.out.println("invalid option you take--> ");
        }

        sc.close();
	}
	public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9; //Fahrenheit to Celsius
    }
	public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;  //Celsius to Fahrenheit
    }
}