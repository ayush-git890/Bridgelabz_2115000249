import java.util.*;
public class P4_MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the length of an array....");
        int n = sc.nextInt();
        try{
            int[] num = n > 0 ? new int[n] : null;
            if(num != null){
                System.out.println("enter values in an array....");
                for (int i = 0; i < n; i++)
                    num[i] = sc.nextInt();
            }
            System.out.print("enter the index here.....");
            int index = sc.nextInt();
            System.out.println("the value present at " + index + ": " + num[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        sc.close();
    }
}