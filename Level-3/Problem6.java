import java.util.*;

public class Problem6{
    public static void main(String[] args) {
        double a1, a2;
        String flag;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        a1 = sc.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        flag = sc.next();
        
        System.out.print("Enter the second number: ");
        a2 = sc.nextDouble();
        
        // performing the operation based on the operator using switch--case
        double ans;
        
        switch(flag) {
            case "+":
                ans = a1 + a2;
                System.out.println(ans);
                break;
            case "-":
                ans = a1 - a2;
                System.out.println(ans);
                break;
            case "*":
                ans = a1 * a2;
                System.out.println(ans);
                break;
            case "/":
                if (a2 != 0) {
                    ans = a1 / a2;
                    System.out.println(ans);
                } else {
                    System.out.println("Error division by zero no allow");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }
}