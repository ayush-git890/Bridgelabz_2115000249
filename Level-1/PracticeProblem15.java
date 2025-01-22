import java.util.*;
public class PracticeProblem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter unit price");
        double unitPrice=sc.nextDouble();

        double quantity=sc.nextDouble(),totalPrice=unitPrice*quantity;

        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);

        sc.close();
    }
}
