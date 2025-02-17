import java.util.*;
public class P2_SortingLargeData{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of dataset--> ");
		int n = sc.nextInt();
		System.out.println("enter elements in dataset--> ");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int arr1[] = Arrays.copyOf(arr,n);
		int arr2[] = Arrays.copyOf(arr,n);
		//estimating the time of bubble sort here.....
		long initialBubbleTime = System.nanoTime();
		bubbleSort(arr);
		long calculateBubbleTime = (System.nanoTime()-initialBubbleTime);
		double finalBubbleTime = calculateBubbleTime/1000000.0;
		
		//estimating the time of merge sort here....
		long initialMergeTime = System.nanoTime();
		mergeSort(arr1,0,arr1.length-1);
		long calculateMergeTime = (System.nanoTime()-initialMergeTime);
		double finalMergeTime = calculateMergeTime/1000000.0;
		System.out.println("merge sort-> "+Arrays.toString(arr));
		
		//estimating the time of quick sort here....
		long initialQuickTime = System.nanoTime();
		quickSort(arr2, 0, arr2.length - 1);
		long calculateQuickTime = (System.nanoTime()-initialQuickTime);
		double finalQuickTime = calculateQuickTime/1000000.0;
		System.out.println("quick sort-> "+Arrays.toString(arr));
		
		System.out.println("the time take in sorting the dataset of size "+n+" in bubble sort-> "+finalBubbleTime+" in merge sort-> "+finalMergeTime+" in quickSort-> "+finalQuickTime);
	}
	public static void bubbleSort(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("bubble sort-> "+Arrays.toString(arr));
	}
	public static void mergeSort(int arr[],int left, int right){
		if (left < right) {
            int mid = left + (right - left) / 2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
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
	public static void quickSort(int arr[], int low, int high){
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