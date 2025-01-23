import java.util.*;
public class Problem13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value here:-");
        int n = sc.nextInt();

        if (n > 0) {
            int correctSum = n * (n + 1) / 2;

            // Compute the sum using a for loop
            int tempSum = 0;
            for (int i = 1; i <= n; i++) {
                tempSum += i;
            }

            // Compare the results
            if (correctSum == tempSum) {
                System.out.println("The results are correct");
            } else {
                System.out.println("The results are not correct");
            }
        } else {
            System.out.println("The value you enter is not a natural number");
        }
        sc.close();
    }
}