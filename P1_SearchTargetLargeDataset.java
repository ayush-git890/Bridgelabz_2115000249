import java.util.*;
public class P1_SearchTargetLargeDataset{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = 10000;
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = i;
		}
		System.out.print("here enter the target element for search--> ");
		int target = sc.nextInt();
		
		long initialLinearTime = System.nanoTime();
		linearSearch(arr,target);
		long calculateLinearTime = (System.nanoTime()-initialLinearTime);
		double finalLinearTime = calculateLinearTime/1000000.0;
		
		Arrays.sort(arr);
		
		long initialBinaryTime = System.nanoTime();
		binarySearch(arr,target);
		long calculateBinaryTime = (System.nanoTime()-initialBinaryTime);
		double finalBinaryTime = calculateBinaryTime/1000000.0;
		
		System.out.println("Time taken for dataset size " + n + ":");
        System.out.println("Linear Search: " + finalLinearTime + " ms");
        System.out.println("Binary Search: " + finalBinaryTime + " ms");
	}
	public static void linearSearch(int arr[],int target){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				System.out.println("target value found in linear search");
				return;
			}
		}
		System.out.println("target value not found in linear search");
	}
	public static void binarySearch(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Target value found in binary search.");
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
		System.out.println("target value not found in binary search");
		return;
	}
}