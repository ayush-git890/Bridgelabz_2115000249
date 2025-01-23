import java.util.*;

public class Problem4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //you enter a value here..................
        System.out.println("Enter value--> ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        // Check if the sum of divisors is greater than the number
        if (sum > n) {
            System.out.println(n + " Abundant number.");
        } else {
            System.out.println(n + " not an Abundant number.");
        }

        sc.close();
    }
}