import java.util.*;

public class PracticeProblem4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius:");
        double celsius = sc.nextDouble();

        //celsius into fahrenheit....
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");

        sc.close();
    }
}