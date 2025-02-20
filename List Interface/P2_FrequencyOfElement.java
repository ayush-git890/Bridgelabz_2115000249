import java.util.*;
public class P2_FrequencyOfElement{
	public static void main(String args[]){
		String arr[] = {"apple","banana","apple","orange"};
		Map<String,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		System.out.println("the frequency of each element stored  in a map is--> "+hm);
	}
}