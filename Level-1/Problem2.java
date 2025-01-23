import java.util.*;

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int number1 = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int number2 = sc.nextInt();
        System.out.println("Enter the 3rd number:");
        int number3 = sc.nextInt();

        boolean isFlag = (number1 < number2 && number1 < number3);
        System.out.println("Is the first number the smallest? " + isFlag);

        sc.close();
    }
}