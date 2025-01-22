import java.lang.Math;
public class PracticeProblem7 {
    public static void main(String[] args) {
        double r = 6378;

        //calculating cubic km
        double a = (4/3)*Math.PI*Math.pow(r,3);
        //calculating cubic miles
        double b = a/Math.pow(1.609,3);

        System.out.println("The volume of earth in cubic kilometers is "+a+" and cubic miles is "+b);
    }
}
