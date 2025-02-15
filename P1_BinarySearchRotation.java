import java.util.*;
public class P1_BinarySearchRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array--> ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter data in an array--> ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the index of smallest element is--> "+smallestElement(arr));
        sc.close();
    }
    public static int smallestElement(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]>arr[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}
