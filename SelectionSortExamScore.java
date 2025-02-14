import java.util.*;
public class SelectionSortExamScore{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the student strength here --> ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter student's exam score here--> ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("here you entered scores of students--> "+Arrays.toString(arr));
		//selection sort implementation...
		selectionSort(arr);
	}
	public static void selectionSort(int arr[]){
		int f = 0;
		while(f!=arr.length){
			for(int i=f;i<arr.length-1;i++){
				if(arr[i]<arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			if(arr[arr.length-1]<arr[f]){
				int temp = arr[arr.length-1];
				arr[arr.length-1] = arr[f];
				arr[f] = temp;
			}
			f++;
		}
		
		System.out.println("the student's exam scores after selection sort is --> "+Arrays.toString(arr));
	}
}