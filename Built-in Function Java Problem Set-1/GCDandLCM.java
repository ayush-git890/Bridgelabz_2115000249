import java.util.*;
public class GCDandLCM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("enter second number: ");
        int n2 = sc.nextInt();
		
        // calculating GCD and LCM
        int gcd = calculateGCD(n1, n2);
        int lcm = calculateLCM(n1, n2, gcd);

        System.out.println("greatest common divisor of " + n1 + " and " + n2 + " is: " + gcd);
        System.out.println("lowest common divisor of " + n1 + " and " + n2 + " is: " + lcm);
		
		sc.close();
	}
	public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}