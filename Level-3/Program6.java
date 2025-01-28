import java.util.*;
public class Program6{
    public static void main(String[] args) {
        int number = 28;
        int[] factors = calcFactor(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        int greatestFactor = greatFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);
        int sumOfFactors = sumFactor(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);
        int productOfFactors = productFactor(factors);
        System.out.println("Product of Factors: " + productOfFactors);
        int productOfCubes = productCubes(factors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);
        if (perfectNumber(number, sumOfFactors)) {
            System.out.println("It's a Perfect Number");
        }
        if (abundantNumber(number, sumOfFactors)) {
            System.out.println("It's an Abundant Number");
        }
        if (defNumber(number, sumOfFactors)) {
            System.out.println("It's a Deficient Number");
        }
        if (isStrongNumber(number)) {
            System.out.println("It's a Strong Number");
        }
    }
    public static int[] calcFactor(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int greatFactor(int[] factors) {
        int greatest = factors[factors.length - 1];
        return greatest;
    }
    public static int sumFactor(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static int productFactor(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static int productCubes(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean perfectNumber(int number, int sumOfFactors) {
        return sumOfFactors - number == number;
    }
    public static boolean abundantNumber(int number, int sumOfFactors) {
        return sumOfFactors - number > number;
    }
    public static boolean defNumber(int number, int sumOfFactors) {
        return sumOfFactors - number < number;
    }
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}