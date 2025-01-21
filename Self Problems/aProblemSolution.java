import java.util.*;
public class aProblemSolution{
	public static void main(String args[]){
		//here we calculated simple interest using Simple Interest = (Principal * Rate * Time) / 100.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Priniciple:");
		int p = sc.nextInt();
		System.out.println("Enter Rate:");
		int r = sc.nextInt();
		System.out.println("Enter Time:");
		int t = sc.nextInt();
		
		int si = (p*r*t)/100;
		System.out.println("The simple interest is: "+si);
	}
}