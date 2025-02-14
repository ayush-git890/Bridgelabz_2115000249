import java.util.*;
public class HeapSortSalary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("enter the strength of job applicants here --> ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter your expected salaries in an array here--> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("here you entered expected salaries--> " + Arrays.toString(arr));
        
        // heap sort implementation...
        heapSort(arr);     
        System.out.println("the expected salaries after heap sort is --> " + Arrays.toString(arr));
	}
	public static void heapSort(int arr[]) {
        int n = arr.length;
		//here i am building max heap....
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
	public static void heapify(int arr[], int n, int idx) {
        int large = idx;  
        int left = 2 * idx + 1;  
        int right = 2 * idx + 2;  

        if (left < n && arr[left] > arr[large]) {
            large = left;
        }

        if (right < n && arr[right] > arr[large]) {
            large = right;
        }

        if (large != idx) {
            int temp = arr[idx];
            arr[idx] = arr[large];
            arr[large] = temp;

            heapify(arr, n, large);
        }
    }
}