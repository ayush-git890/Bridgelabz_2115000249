import java.util.*;
public class P6_CompairingDataStructure{
	public static void main(String args[]){
		int[] size = {1000000, 10000, 1000};
        for (int n : size) {
            int target = n - 1;
            int arr[] = new int[n];
            HashSet<Integer> hs = new HashSet<>();
            TreeSet<Integer> ts = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                arr[i] = i;
                hs.add(i);
                ts.add(i);
            }

            // Search in Array
            long initialArrayTime = System.nanoTime();
            searchArray(arr, target);
            long calculateArrayTime = (System.nanoTime() - initialArrayTime);
            double finalArrayTime = calculateArrayTime / 1000000.0;

            // Search in HashSet
            long initialHashTime = System.nanoTime();
            searchHashSet(hs, target);
            long calculateHashTime = (System.nanoTime() - initialHashTime);
            double finalHashTime = calculateHashTime / 1000000.0;

            // Search in TreeSet
            long initialTreeTime = System.nanoTime();
            searchTreeSet(ts, target);
            long calculateTreeTime = (System.nanoTime() - initialTreeTime);
            double finalTreeTime = calculateTreeTime / 1000000.0;

            // Print results
            System.out.println("Search time (ms) for dataset size " + n + ":");
            System.out.println("the time take by array is-> "+finalArrayTime+" or by hashset-> "+finalHashTime+" or by treeset-> "+finalTreeTime);
	    }
    }
	public static void searchArray(int arr[],int target){
		for (int num : arr) {
            if (num == target) break;
        }
	}
	public static void searchHashSet(HashSet<Integer> hs, int target){
		hs.contains(target);
	}
	public static void searchTreeSet(TreeSet<Integer> ts,int target){
		ts.contains(target);
	}
}