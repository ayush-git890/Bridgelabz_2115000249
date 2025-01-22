import java.util.*;

public class PracticeProblem12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter weight in pounds:");
        double pounds = sc.nextDouble();
        
        //converting pounds into kg
        double kilograms = pounds / 2.2;
        
        System.out.println("The weight of the person in pound is " + pounds + " and in kg is " + kilograms);
        
        sc.close();
    }
}