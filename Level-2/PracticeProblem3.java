import java.util.*;

public class PracticeProblem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = sc.nextDouble();
        System.out.println("Enter second number:");
        double b = sc.nextDouble();
        System.out.println("Enter third number:");
        double c = sc.nextDouble();

        // Perform operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        sc.close();
    }
}