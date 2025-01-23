import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter num here....
        System.out.println("Enter a num:-- ");
        int num = sc.nextInt();

        int sum = 0;
        int ans = num;

        //calculating the armstrong num
        while (num != 0) {
            int temp = num % 10; 
            sum += temp * temp * temp;  
            num /= 10; 
        }

        // Check if the sum is equal to the original num to determine if it's an Armstrong num
        if (sum == ans) {
            System.out.println(ans + " is Armstrong num.");
        } else {
            System.out.println(ans + " is not Armstrong num.");
        }

        sc.close();
    }
}