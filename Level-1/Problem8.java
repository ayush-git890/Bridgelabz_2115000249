import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value");
        int counter = sc.nextInt();
        
        System.out.println("Answer is:-");
        while (counter >= 1) {
            //it will print the counter row wise.....
            System.out.print(counter+" ");
            counter--;
        }
        sc.close();
    }
}