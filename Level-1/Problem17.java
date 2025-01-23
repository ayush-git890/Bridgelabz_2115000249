import java.util.*;

public class Problem17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter salary here
        System.out.println("Enter salary:");
        double sal = sc.nextDouble();

        //eneter yos here
        System.out.println("Enter years of service:");
        int yos = sc.nextInt();

        // Calculating bonus
        double bonus = 0;
        if (yos > 5) {
            bonus = sal * 0.05; // 5% bonus more than 5 years
        }
        
        if (bonus > 0) {
            System.out.println("The bonus for the employee is: " + bonus);
        } else {
            System.out.println("No bonus");
        }

        sc.close();
    }
}