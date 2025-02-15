import java.util.*;
public class P1_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string....");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println("so you entered this-> "+s);
        System.out.println("the reversed string using string builder is--> "+sb.reverse().toString());
        sc.close();
    }
}