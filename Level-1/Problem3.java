import java.util.*;
public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int number1 = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int number2 = sc.nextInt();
        System.out.println("Enter the 3rd number:");
        int number3 = sc.nextInt();

        boolean isNum1 = (number1 > number2 && number1 > number3);
        boolean isNum2 = (number2 > number1 && number2 > number3);
        boolean isNum3 = (number3 > number1 && number3 > number2);

        System.out.println("Is the first number the largest? " + isNum1);
        System.out.println("Is the second number the largest? " + isNum2);
        System.out.println("Is the third number the largest? " + isNum3);

        sc.close();
    }
}