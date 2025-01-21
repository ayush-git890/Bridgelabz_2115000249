import java.util.*;
import java.lang.Math;

public class fifthProblemSolution{
	public static void main(String args[]){
		//here we calculated volume of cylinder using volume = pi*r^2*height
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of radius: ");
		int rad = sc.nextInt();
		System.out.println("enter the value of height: ");
		int h = sc.nextInt();
		
		double vol = Math.PI * (int)Math.pow(rad,2) * h;
		System.out.println("the volume of cylinders: "+vol);
	}
}