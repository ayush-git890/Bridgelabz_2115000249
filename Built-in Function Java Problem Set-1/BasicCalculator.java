import java.util.*;
public class BasicCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("enter 1 for addition in the choice...");
		
        System.out.println("enetr 2 for subracttion in the choice...");
        System.out.println("enter 3 for multiplication in the choice...");
		
        System.out.println("enetr 4 for division in the choice...");
        System.out.print("so, what's your choice for these---> ");
        int flag = sc.nextInt();

        System.out.print("enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("enter second number: ");
        double n2 = sc.nextDouble();

        double ans = 0;
        switch (flag) {
            case 1:
                ans = add(n1, n2);
                System.out.println("result---> " + ans);
                break;
            case 2:
                ans = sub(n1, n2);
                System.out.println("result---> " + ans);
                break;
            case 3:
                ans = mul(n1, n2);
                System.out.println("result---> " + ans);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("not divided by zero here---");
                } else {
                    ans = div(n1, n2);
                    System.out.println("result---" + ans);
                }
                break;
            default:
                System.out.println("you enteres wrong option!!!!!");
        }

        sc.close();
	}
	public static double add(double a, double b) {
        return a + b; //for addition
    }
	public static double sub(double a, double b) {
        return a - b; //for subtraction
    }
	public static double mul(double a, double b) {
        return a * b; //for multiplication
    }
	public static double div(double a, double b) {
        return a / b; //for division
    }
}