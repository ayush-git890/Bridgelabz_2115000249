//the maximum number of handshakes use input for numberOfStudents variable
import java.util.*;
public class Program3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no. of students here-> ");
		int numberOfStudents = sc.nextInt();
		
		// formula to be used here for calculating the total no. handshakes
		int flag = (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.println("the number of possible handshakes: "+flag);
	}
}