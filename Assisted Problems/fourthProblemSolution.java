import java.util.*;
import java.lang.Math;

public class fourthProblemSolution{
	public static void main(String args[]){
		//here we calculated area of circle using this formula area = pi*r^2s
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r = sc.nextInt();
		double ar = Math.PI * (int)Math.pow(r,2);
		
		System.out.println("The area of circle is: "+ar);
	}
}