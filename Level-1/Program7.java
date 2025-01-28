//program to find the sum of n natural numbers using loop
import java.util.*;
public class Program7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you have to calculate the sum--> ");
        int n = sc.nextInt();
        System.out.print("The sum is -> "+calculateSum(n));
		
		sc.close();
    }
    public static int calculateSum(int n) {
        int sum = 0;
        if (n > 0) {
			//here i amm using for loop for sum....
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        return sum;
    }
}