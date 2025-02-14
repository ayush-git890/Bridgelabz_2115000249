import java.util.*;
public class BubbleSortMarks{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("please total strength of students here-> ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the students marks in an array-> ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("So you entered these marks--> "+Arrays.toString(arr));
		//bubble sorting operations begins from here.......
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("teh marks after sorting are--> "+Arrays.toString(arr));
	}
}