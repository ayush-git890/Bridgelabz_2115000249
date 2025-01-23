import java.util.*;
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double sum = 0.0; // Initialize to sum to 0.0
        double num;

        System.out.println("Enter number to add to the sum or you can enter 0 to stop it");
        num = sc.nextDouble();
        while (num!=0.0) {
            sum += num;
            System.out.println("Enter number to add to the sum or you can enter 0 to stop it");
            num = sc.nextDouble();
        }
        
        System.out.println("The sum is:- " + sum);
        sc.close();
    }
}