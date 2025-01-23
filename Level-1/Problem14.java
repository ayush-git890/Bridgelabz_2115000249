import java.util.*;
public class Problem14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number here:");
        int n = sc.nextInt();

        if (n >= 0) {
            long fact = 1;
            int temp = n;
            while (temp > 0) {
                fact *= temp; // mutiltiply the curent value with previous one.....
                temp--;
            }

            System.out.println("The fact of " + n + " is: " + fact);
        } else {
            System.out.println("The value " + n + " is not a positive integer.");
        }

        sc.close();
    }
}