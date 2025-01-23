import java.util.*;
public class Problem12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value here:");
        int n = sc.nextInt();

        if (n > 0) {
            int correctSum = n * (n + 1) / 2;

            // doing the computation here................
            int tempSum = 0;
            int flag = 1;
            while (flag <= n) {
                tempSum += flag;
                flag++;
            }

            // Compare the results
            if (correctSum == tempSum) {
                System.out.println("The results are correct");
            } else {
                System.out.println("The results are not correct");
            }
        } else {
            System.out.println("The value " + n + " not a natural number");
        }
        sc.close();
    }
}