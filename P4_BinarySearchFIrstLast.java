import java.util.*;
public class P4_BinarySearchFIrstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array--> ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter data in an array--> ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the target element--> ");
        int target = sc.nextInt();
        if(findFirstOccurrence(arr, target)==-1){
            System.out.println("target element not founded....");
        }
        else{
            System.out.println("first occurence--> "+findFirstOccurrence(arr, target));
            System.out.println("last occurence is --> "+findLastOccurrence(arr, target));
        }
        sc.close();
    }
    public static int findFirstOccurrence(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        int firstIdx = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                firstIdx = mid;
                right = mid-1;
            }
            else if(arr[mid]<target){
                left = mid + 1;
            }
            else{
                right = mid-1;
            }
        }
        return firstIdx;
    }
    public static int findLastOccurrence(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        int lastIdx = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                lastIdx = mid;
                left = mid+1;
            }
            else if(arr[mid]<target){
                left = mid + 1;
            }
            else{
                right = mid-1;
            }
        }
        return lastIdx;
    }
}