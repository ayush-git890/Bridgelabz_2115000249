import java.util.*;
public class PracticeProblem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of students");
        int numberOfStudents=sc.nextInt();

        //handshake numbers
        int handshakes=(numberOfStudents*(numberOfStudents-1))/2;

        //answer
        System.out.println("The maximum number of handshakes is "+handshakes);

        sc.close();
    }
}
