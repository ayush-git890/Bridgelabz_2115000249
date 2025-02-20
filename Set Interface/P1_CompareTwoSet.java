import java.util.*;
public class P1_CompareTwoSet{
	public static void main(String args[]){
		Set<Integer> hs1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> hs2 = new HashSet<>(Arrays.asList(3, 2, 1));
		
		if(hs1.equals(hs2)){
			System.out.println("the both sets are equal....");
		}
		else{
			System.out.println("the both sets are not equal....");
		}
	}
}