import java.util.*;
public class thirdProblemSolution{
	public static void main(String args[]){
		//here we convertl 'celsius temperature' into 'farenheit'
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius: ");
		int cel = sc.nextInt();
		int fah = (cel * 9/5) + 32;
		System.out.println("The temperature after conversion in Fahrenheit: "+fah);
	}
}