//a program to find the sum of n natural numbers using recursive method and compare the ansult with the formulae n*(n+1)/2
import java.util.*;
public class Program2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number here ---> ");
        int n = sc.nextInt();
        if (sumOfNaturalNumberUsingFormula(n) == sumOfNaturalNumberUsingRecursion(n)) {
            System.out.println("it's same: " + sumOfNaturalNumberUsingFormula(n));
        } else {
            System.out.println("it's not same");
        }
		
		sc.close();
    }

    public static int sumOfNaturalNumberUsingFormula(int n) {
        int ans = (n * (n + 1)) / 2;
        return ans;
    }

    public static int sumOfNaturalNumberUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = 0;
        sum = n + sumOfNaturalNumberUsingRecursion(n - 1);
        return sum;
    }
}