import java.util.*;
import java.lang.Math;
public class cProblemSolution{
	public static void main(String args[]){
		//here we calculated Power Calculation (a^b)
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the value of base:");
		int base = sc.nextInt();
		System.out.println("Enter the value of exponent:");
		int e = sc.nextInt();
		System.out.println("the result of base raised to the exponent: "+(int)Math.pow(base,e)); //raised to power
		
	}
}