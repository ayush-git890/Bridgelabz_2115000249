import java.util.*;
public class eProblemSolution{
	public static void main(String args[]){
		//here we calculated conversion of kilometers into miles...
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in kilometers: ");
		int k = sc.nextInt();
		
		//conversion into miles
		double m = k * 0.621371;
		
		System.out.println("The distance in miles after conversion is: "+m);
	}
}