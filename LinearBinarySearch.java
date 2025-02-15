import java.util.*;
public class LinearBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array--> ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter data in an array--> ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the first missing +ve number is--> "+firstPositiveInteger(arr));
        
        System.out.print("please enter the target element--> ");
        int target = sc.nextInt();
        Arrays.sort(arr);
        int idx = binarySearch(arr, target);
        if(idx==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found");
        }
        sc.close();
    }
    public static int firstPositiveInteger(int arr[]){
        for(int i=0;i<arr.length;i++){
            if (arr[i] <= 0 || arr[i] > arr.length) {
                arr[i] = arr.length + 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int num = Math.abs(arr[i]);
            if (num <= arr.length && arr[num - 1] > 0) {
                arr[num - 1] = -arr[num - 1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return arr.length+1;
    }
    public static int binarySearch(int arr[],int target){
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}