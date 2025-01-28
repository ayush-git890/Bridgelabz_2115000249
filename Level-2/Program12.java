//a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value
import java.util.*;
public class Program12{
    public static void main(String[] args) {
        int size = 5;
        int[] arr = generate4DigitRandomArray(size);
        System.out.println("Generated Numbers: " + Arrays.toString(arr));
        double[] nums = findAverageMinMax(arr);
        System.out.println("Average: " + nums[0]);
        System.out.println("Minimum: " + nums[1]);
        System.out.println("Maximum: " + nums[2]);
    }
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int) (Math.random() * 9000);
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }
}