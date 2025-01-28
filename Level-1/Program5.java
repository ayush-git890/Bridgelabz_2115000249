//program to check whether a number is positive, negative, or zero
import java.util.*;
public class Program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enetr a number--> ");
        int num = sc.nextInt();
		
        System.out.println("hence the answer is--> "checkEvenOdd(num));
		sc.close();
    }
    public static int checkEvenOdd(int num) {
		//if for +ve number....
        if (num > 0) {
            return 1;
        }
		//if for -ve number....
        if (num < 0) {
            return -1;
        }
		//otherwise....
        return 0;
    }
}