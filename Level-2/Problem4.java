import java.util.*;

public class Problem4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number:");
        int number = sc.nextInt();

        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " a prime number.");
            } else {
                System.out.println(number + " not a prime number.");
            }
        }

        sc.close();
    }
}