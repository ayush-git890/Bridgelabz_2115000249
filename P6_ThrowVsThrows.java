import java.util.*;
public class P6_ThrowVsThrows {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0)
            throw new IllegalArgumentException("Amount and rate must be positive.....");
        return (amount * rate * years) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("here enter pricipal--> ");
            double pa = sc.nextDouble();
            System.out.print("here enter interest rate--> ");
            double rate = sc.nextDouble();
            System.out.print("here enter no. of years--> ");
            int y = sc.nextInt();

            double ans = calculateInterest(pa, rate, y);
            System.out.println(ans);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        sc.close();
    }
}