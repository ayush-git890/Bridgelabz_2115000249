//a program to find the factors of a number taken as user input, store the factors in an array and display the factors
import java.util.*;
import java.lang.Math;
public class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter a number--> ");
        int num = sc.nextInt();
        int factors[] = calculateFactor(num);
		
		System.out.println("the factor is-> ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        int sum = sumOfTheFactors(factors);
        int product = productOfTheFactor(factors);
        int sumOfSquares = squareOfTheFactor(factors);
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
		
		sc.close();
    }
    public static int[] calculateFactor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int factors[] = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[idx++] = i;
            }
        }
        return factors;
    }
    public static int sumOfTheFactors(int factors[]) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static int productOfTheFactor(int factors[]) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static int squareOfTheFactor(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
}