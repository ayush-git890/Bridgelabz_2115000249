import java.util.*;
public class P1_ZeroSumSubarray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of an array-> ");
		int n = sc.nextInt();
		int num[] = new int[n];
		System.out.println("enter the elements in an array-> ");
		for(int i=0;i<num.length;i++){
			num[i] = sc.nextInt();
		}
		
		zeroSumSubArray(num);
	}
	public static void zeroSumSubArray(int num[]){
		Map<Integer,List<Integer>> hm = new HashMap<>();
		int sum = 0;
		List<int[]> arr = new ArrayList<>();
		hm.put(0,new ArrayList<>());
		hm.get(0).add(-1);
		
		for(int i=0;i<num.length;i++){
			sum = sum + num[i];
			if(hm.containsKey(sum)){
				for(int idx:hm.get(sum)){
					arr.add(new int[]{idx+1,i});
				}
			}
			
			hm.putIfAbsent(sum,new ArrayList<>());
			hm.get(sum).add(i);
		}
		
		if(arr.isEmpty()){
			System.out.println("list is empty..............");
		}
		else{
			System.out.println("the subarray we found are:- ");
			for(int idx[]:arr){
				System.out.println(Arrays.toString(idx));
			}
		}
	}
}