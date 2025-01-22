import java.util.*;

public class PracticeProblem6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter the bonus:");
        double bonus = sc.nextDouble();

        //adding the bonus with salary...
        double totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

        sc.close();
    }
}