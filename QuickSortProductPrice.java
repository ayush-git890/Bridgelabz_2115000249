import java.util.*;
public class QuickSortProductPrice{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of products here --> ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the product prices here in an array--> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("here you entered product prices--> " + Arrays.toString(arr));
        
        // quick sort implementation...
        quickSort(arr, 0, arr.length - 1);
        System.out.println("the product prices after quick sort is --> " + Arrays.toString(arr));
	}
	public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }
	public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];//here i am choosing last element as pivot...
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
}