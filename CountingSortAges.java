import java.util.*;
import java.lang.Math;
public class CountingSortAges{
	public static void main(String args[]){
		int ages[] = {10,11,15,16,12,19,13};
		System.out.println("the students ages before counting sort--> "+Arrays.toString(ages));
		countingSort(ages);
	}
	public static void countingSort(int arr[]){
		int max = 0;
		int ans[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			max = Math.max(max,arr[i]);
		}
		int arr1[] = new int[max+1];
		//for calculating frequency
		for(int i=0;i<arr.length;i++){
			arr1[arr[i]]++;
		}
		//for summing the two numbers into second number....
		for(int i=1;i<arr1.length;i++){
			int sum = arr1[i]+arr1[i-1];
			arr1[i] = sum;
		}
		//for putting the number on thier exact position....
		for(int i=0;i<arr.length;i++){
			ans[arr1[arr[i]]-1] = arr[i];
		}
		
		System.out.println("the student's ages after counting sort--> "+Arrays.toString(ans));
	}
}