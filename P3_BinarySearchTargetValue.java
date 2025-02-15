import java.util.*;
public class P3_BinarySearchTargetValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of rows--> ");
        int r = sc.nextInt();
        System.out.print("enter no. of colums--> ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("enter data in an array--> ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("enetr the target value here --> ");
        int target = sc.nextInt();
        System.out.println(findTargetValue(arr,target)?"founded":"not founded");
        sc.close();
    }
    public static boolean findTargetValue(int arr[][],int target){
        int r = arr.length;
        if(r==0)return false;
        int c = arr[0].length;

        int left = 0;
        int right = r*c-1;
        while(left<right){
            int mid = left + (right - left)/2;
            int temp = arr[mid/c][mid%c];
            if(temp == target){
                return true;
            }
            else if(temp<target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}