//a program calculate the wind chill temperature given the temperature and wind speed
import java.util.*;
import java.lang.Math;
public class Program11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter the temperature--> ");
        double temp = sc.nextDouble();
		System.out.println("enter the wind speed--> ");
        double windSpeed = sc.nextDouble();
        System.out.println("the answer is -> "+calculateWindChill(temp, windSpeed));
		
		sc.close();
    }

    public static double calculateWindChill(double temp, double windSpeed) {
        double answer = 35.74 + (0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
        return answer;
    }
}