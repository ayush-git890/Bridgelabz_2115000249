import java.util.*;
public class P4_RemoveDuplicates{
	public static void main(String args[]){
		List<Integer> arr = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
		System.out.println("here we have original list--> "+arr);
		
		List<Integer> ans = removeDuplicate(arr);
		System.out.println("the list after removing duplicates --> "+ans);
	}
	public static List<Integer> removeDuplicate(List<Integer> arr){
		Set<Integer> hs = new LinkedHashSet<>(arr);
		return new ArrayList<>(hs);
	}
}