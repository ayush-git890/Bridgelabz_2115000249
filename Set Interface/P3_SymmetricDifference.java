import java.util.*;
public class P3_SymmetricDifference{
	public static void main(String args[]){
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
		
		System.out.println("the original list are--> "+set1+" , "+set2);
		//union
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		
		//intersection
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		
		//SymmetricDifference
		union.removeAll(intersection);
		System.out.println("the symmetric difference is--> "+union);
	}
}