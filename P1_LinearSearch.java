import java.util.*;
public class P1_LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a size of an array--> ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter a number in an array--> ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the negative numbe is at index number--> "+findNegativeNumber(arr));
        sc.close();
    }
    public static int findNegativeNumber(int arr[]){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }
}