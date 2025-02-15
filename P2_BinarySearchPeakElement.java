import java.util.*;
public class P2_BinarySearchPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array--> ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter data in an array--> ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the peak element in an array is "+arr[peakElement(arr)]);
        sc.close();
    }
    public static int peakElement(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = left + (right-left)/2;

            if(arr[mid]>arr[mid+1]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}