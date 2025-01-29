import java.util.*;
import java.lang.Math;
public class ThreeNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int[] arr = userInput(sc);
        // Finding the maximum
        int max = helperMax(arr[0], arr[1], arr[2]);

        System.out.println("The maximum number is: " + max);
		sc.close();
	}
	public static int[] userInput(Scanner sc) {
        int[] nums = new int[3];
        System.out.println("Enter three arr:");
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        return nums;
    }
	public static int helperMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}