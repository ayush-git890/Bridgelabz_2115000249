import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double sum = 0.0; // Initialize to sum to 0.0
        double num;

        System.out.println("Enter number to add to the sum or you can enter 0 to stop it");
        
        while (true) {
            System.out.println("Enter number to add to the sum or you can enter 0 to stop it");
            num = sc.nextDouble();
            if (num == 0) {
                break; // here i break the loop when the condition is satisfied....
            }
            sum += num;
        }
        
        System.out.println("The sum is:- " + sum);
        sc.close();
    }
}