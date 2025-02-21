import java.util.*;
public class P7_FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("here enter numerator--> ");
            int n1 = sc.nextInt();
            System.out.print("here enter denominator-->  ");
            int n2 = sc.nextInt();

            int ans = n1 / n2;
            System.out.println(ans);
        }
        catch (ArithmeticException e) {
            System.out.println("division by 0 is not allowed.......");
        }
        finally {
            System.out.println("Operation completed");
        }
        sc.close();
    }
}