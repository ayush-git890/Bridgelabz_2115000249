//Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results
import java.util.*;
import java.lang.Math;
public class Program3{
    public static void main(String[] args) {
        int number = 153;
        int digitCount = cd(number);
        System.out.println("Digit Count: " + digitCount);
        int[] digits = sd(number, digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));
        int sumOfDigits = findSumOfDigits(digits);
        System.out.println("Sum of Digits: " + sumOfDigits);
        int sumOfSquares = findSumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);
        if (isHarshadNumber(number, sumOfDigits)) {
            System.out.println("It's a Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        int[][] digitFrequencies = findDigitFrequencies(digits);
        for (int[] frequency : digitFrequencies) {
            System.out.println("Digit: " + frequency[0] + ", Frequency: " + frequency[1]);
        }
    }
    public static int cd(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static int[] sd(int number, int digitCount) {
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int findSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }
    public static int[][] findDigitFrequencies(int[] digits) {
        int[][] frequencies = new int[10][2]; // 0-9 digits
        for (int digit : digits) {
            frequencies[digit][0] = digit;
            frequencies[digit][1]++;
        }
        return frequencies;
    }
}