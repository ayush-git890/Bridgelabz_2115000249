import java.util.*;
public class PracticeProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number:");

        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("enter third number:");
        int c=sc.nextInt();

        //operation that to be perform...
        int result1=a+b*c,result2=a*b+c,result3=c+a/b,result4=a%b+c;

        System.out.println("The results of Int Operations are "+result1+", "+result2+", "+result3+", and "+result4);

        sc.close();
    }
}
