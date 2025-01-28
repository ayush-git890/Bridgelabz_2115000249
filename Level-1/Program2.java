// program to find the maximum no. of handshakes...
import java.util.*;
public class Program2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of student--> ");
        int n = sc.nextInt();

        //hiere i calculate the total no. of handshake
        int maxHandshakes = calulateTotalHandshake(n);

        System.out.printf("The maximum number of handshakes among %d students is %d\n", n, maxHandshakes);

        sc.close();
    }

    //here we use method
    public static int calulateTotalHandshake(int n) {
        return (n * (n - 1)) / 2;
    }
}