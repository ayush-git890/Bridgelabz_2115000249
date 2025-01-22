import java.util.*;

public class PracticeProblem13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter perimeter");
        double perimeter=sc.nextDouble();

        double side=perimeter/4;


        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
        sc.close();
    }
}
