import java.util.*;
public class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number here---> ");
		int n = sc.nextInt();
		
		//to calculate factorial here--->
		System.out.println("the factorial of a number "+n+" is "+fact(n));
	}
	public static int fact(int n){
		if(n==1){
			return n;
		}
		
		//here i sour logic to find the factorial recursively.....
		return n*fact(n-1);
	}
}