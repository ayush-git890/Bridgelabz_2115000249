import java.util.*;
public class P4_SetToSortedList{
	public static void main(String args[]){
		Set<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(3);
        hs.add(9);
        hs.add(1);

        List<Integer> ans = setToSortedList(hs);
        System.out.println("Sorted List----> " + ans);
	}
	public static List<Integer> setToSortedList(Set<Integer> hs) {
        List<Integer> arr = new ArrayList<>(hs);
        bubbleSort(arr);
        return arr;
    }
	public static void bubbleSort(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) { 
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}