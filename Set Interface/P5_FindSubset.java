import java.util.*;
public class P5_FindSubset{
	public static void main(String args[]){
		Set<Integer> hs1 = new HashSet<>();
        hs1.add(2);
        hs1.add(3);

        Set<Integer> hs2 = new HashSet<>();
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);
        hs2.add(4);
		
		System.out.println("Is Set1 a subset of Set2-->" + isSubset(hs1, hs2));
	}
	public static boolean isSubset(Set<Integer> hs1, Set<Integer> hs2) {
        return hs2.containsAll(hs1);
    }
}