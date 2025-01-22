import java.util.*;

public class PracticeProblem10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of chocolates:");
        int numberOfChocolates = sc.nextInt();
        System.out.println("Enter the total number of children:");
        int numberOfChildren = sc.nextInt();
        
        //calculation performing
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

        sc.close();
    }
}