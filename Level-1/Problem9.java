import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value");
        int counter = sc.nextInt();
        
        System.out.println("Answer is:-");
        for(int i=counter;i>=1;i--){
            //it will print the counter row wise.....using for loop
            System.out.print(i+" ");
        }
        sc.close();
    }
}