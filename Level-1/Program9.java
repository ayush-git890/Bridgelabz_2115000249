//program to take 2 numbers and print their quotient and reminder
import java.util.*;
public class Program9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number--> ");
        int n1 = sc.nextInt();
		System.out.println("enter 2nd number--> ");
        int n2 = sc.nextInt();
		
        int[] arr = findRemainderAndQuotient(n1, n2);
        System.out.println("Quotient: " + arr[0]);
        System.out.println("Remainder: " + arr[1]);
		
		sc.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int q = number / divisor;
        int rem = number % divisor;
        return new int[] { q, rem };
    }
}