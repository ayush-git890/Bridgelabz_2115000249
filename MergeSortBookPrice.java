import java.util.*;
public class MergeSortBookPrice{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of books here --> ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the book prices here--> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("here you entered book prices--> " + Arrays.toString(arr));
        // merge sort implementation...
        divide(arr, 0, arr.length - 1);
        System.out.println("the book prices after merge sort is --> " + Arrays.toString(arr));
	}
	public static void divide(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            divide(arr, left, mid);
            divide(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
	public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
		
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}