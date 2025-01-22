import java.util.*;

public class PracticeProblem5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = sc.nextDouble();

        //conversion fahrenheit into celsius....
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");

        sc.close();
    }
}