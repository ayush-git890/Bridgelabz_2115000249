import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //enter the natural number
        System.out.println("Enter a natural number:");
        int number = sc.nextInt();

        //computation
        if (number >= 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " Natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a Natural number");
        }

        sc.close();
    }
}