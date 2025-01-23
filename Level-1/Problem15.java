import java.util.*;
public class Problem15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number here:");
        int n = sc.nextInt();

        if (n >= 0) {
            long fact = 1;

            //here i used for loop
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("The factorial of " + n + " is: " + fact);
        } else {
            System.out.println("The value " + n + " is not a positive integer.");
        }

        sc.close();
    }
}