//program to find the smallest and the largest of the 3 numbers
import java.util.*;
import java.lang.Math;
public class Program8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter first number-> ");
        int a = sc.nextInt();
		System.out.println("enter second number-> ");
        int b = sc.nextInt();
		System.out.println("enter third number-> ");
        int c = sc.nextInt();
		
        int[] arr = calculateSmallAndLargest(a, b, c);
		
        System.out.println("the smallest numbers in the series is -> " + arr[0]);
        System.out.println("the largest number in the seriews is -> " + arr[1]);
    }

    public static int[] calculateSmallAndLargest(int a, int b, int c) {
		//using Math library to calculate small and large.....
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[] { smallest, largest };
    }
}