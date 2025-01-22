import java.util.*;
public class PracticeProblem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fee");
        int fee = sc.nextInt();

        System.out.println("enter the discount");
        int discountPercent = sc.nextInt();
	int discount = (fee*discountPercent)/100;

	//after computation
	int total = (fee - discount);
	System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+total);
    sc.close();
    }
}
