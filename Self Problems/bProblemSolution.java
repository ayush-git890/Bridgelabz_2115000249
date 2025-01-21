import java.util.*;
public class bProblemSolution{
	public static void main(String args[]){
		// here we calculated Perimeter of a Rectangle using Perimeter = 2 * (length + width).
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		int l = sc.nextInt();
		System.out.println("Enter the width:");
		int w = sc.nextInt();
		
		//perimeter
		int p = 2 * (l+w);
		System.out.println("The Perimeter of rectangle is : "+p);
	}
}