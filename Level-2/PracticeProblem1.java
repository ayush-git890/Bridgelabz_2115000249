import java.util.*;
public class PracticeProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number:");
        int number1=sc.nextInt();
        System.out.println("enter second number:");
        int number2=sc.nextInt();

        //to calculate quotient...
        int quotient=number1/number2;
        
        //to calculate remainder
        int remainder=number1%number2;

        System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two numbers "+number1+" and "+number2);

        sc.close();
    }
}