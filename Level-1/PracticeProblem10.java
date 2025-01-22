import java.util.*;
public class PracticeProblem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height");
        double height = sc.nextDouble();
        
        //convert height into feet and inch
        double inch = height/2.54;
        double feet = inch/12;

        System.out.println("Your Height in cm is "+height+" while in feet is "+(int)feet+" and inches is "+(int)(inch%12));
        sc.close();
    }
}
