import java.util.*;
public class FibonacciNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("enter total number here --> ");
        int n = sc.nextInt();
        // generating and printing Fibonacci series.....
        fibonacciNumber(n);
		sc.close();
	}
	public static void fibonacciNumber(int n) {
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0, b = 1;
        System.out.print("fibonacci series-> : " + a);
        if (n > 1) System.out.print(", " + b);
        
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            System.out.print(", " + temp);
            a = b;
            b = temp;
        }
        System.out.println();
    }
}