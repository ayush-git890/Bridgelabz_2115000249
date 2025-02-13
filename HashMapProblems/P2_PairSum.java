import java.util.*;
public class P2_PairSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length o an array-> ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enetr the elements in an array-> ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("enter the target sum here : ");
		int target = sc.nextInt();
		
		if(targetSum(arr,target)){
			System.out.println("hence there is pair existed...");
		}
		else{
			System.out.println("no pair");
		}
	}
	public static boolean targetSum(int arr[],int target){
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++){
			int k = target - arr[i];
			if(hm.containsKey(k)){
				return true;
			}
			hm.put(arr[i],i);
		}
		
		return false;
	}
}