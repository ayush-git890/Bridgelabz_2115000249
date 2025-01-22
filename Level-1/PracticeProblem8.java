import java.util.*;

public class PracticeProblem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometer:");
        double km = sc.nextDouble();
        //km into miles
        double mil = km/1.6;

        System.out.println("The total miles is "+mil+" mile for the given "+km+"km");
        sc.close();
        
    }
}
