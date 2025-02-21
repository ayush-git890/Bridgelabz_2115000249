import java.util.*;
public class P2_UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		try{
			System.out.print("here please enter num 1--> ");
			int n1 = sc.nextInt();
			System.out.print("here please enter num 2--> ");
			int n2 = sc.nextInt();
			int ans = n1/n2;
			System.out.println("the division of two numbers is this--> "+ans);
		}
		catch(ArithmeticException e){
			System.out.println("don't enter 0 in denominator....");
		}
		catch(InputMismatchException e){
			System.out.println("enter only numberic numbers here.....");
		}

        sc.close();
    }
}