import java.util.*;
public class PrimeNumberCheck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//it is used to enter a number here----->
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        
        // checking if the number is prime
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
		
		sc.close();
	}
	public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}