import java.util.*;
public class PracticeProblem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the distance in feet");
        double distanceInFeet =  sc.nextDouble();

        double yards=distanceInFeet/3,miles=yards/1760;

        System.out.println("The distance in feet is "+distanceInFeet+", in yards is "+yards+" and in miles is "+miles);
        sc.close();
    }
}
