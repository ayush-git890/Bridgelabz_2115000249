import java.util.*;
public class P1_ReverseAList{
	public static void main(String args[]){
		List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));//this is for arraylist...
		LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));//this is for linked list...
		
		reversedList(arr);
		System.out.println("the reverse list through a arraylist is-> "+arr);
		reversedList(ll);
		System.out.println("the reversed list through linked list is-> "+ll);
	}
	public static void reversedList(List<Integer> L){
		int left = 0, right = L.size() - 1;
        while (left < right) {
            int temp = L.get(left);
            L.set(left, L.get(right));
            L.set(right, temp);
            left++;
            right--;
        }
	}
}