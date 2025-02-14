import java.util.*;
public class InsertionSortEmployee{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the employee strength here--> ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter employee id in an array...");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("the employee id's you enter here are--> "+Arrays.toString(arr));
		//insertion sort approach....
		insertionSort(arr);
	}
	public static void insertionSort(int arr[]){
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				int temp = arr[i];
				arr[i] = arr[i-1];;
				arr[i-1] = temp;
				for(int j=i-1;j>0;j--){
					if(arr[j]<arr[j-1]){
						int flag = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
					}
				}
			}
		}
		System.out.println("the employee id's after insertion sort--> "+Arrays.toString(arr));
	}
}