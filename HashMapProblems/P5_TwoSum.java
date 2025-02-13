import java.util.*;
public class P5_TwoSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length of an array:- ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter a element for an array:- ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("eneter the traget sum:- ");
		int target = sc.nextInt();
		
		System.out.println("the two indices are:- "+findTwoSum(arr,target));
	}
	public static String findTwoSum(int arr[], int target){
		if(arr.length==0){
			return "empty array";
		}
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],i);
		}
		int a1=0;
		int a2=0;
		for(int i=0;i<arr.length;i++){
			int k = target - arr[i];
			if(hm.containsKey(k)){
				a1 = i;
				a2 = hm.get(k);
				break;
			}
		}
		return ""+a1+" "+a2;
	}
}