import java.util.*;
import java.lang.Math;

public class PracticeProblem9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input for the sides of the triangular park
        System.out.println("Enter the length of the first side of the park (in meters):");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of the second side of the park (in meters):");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of the third side of the park (in meters):");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;

        // Converting 5 km to meters
        double totalDistance = 5000;
        double rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");

        sc.close();
    }
}