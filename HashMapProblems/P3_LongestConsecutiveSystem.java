import java.util.*;
public class P3_LongestConsecutiveSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length of an array-> ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enetr a element in an array-> ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("the longest consecutive element size is: "+lcs(arr));
	}
	public static int lcs(int arr[]){
		if(arr.length==0){
			return 0;
		}
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		int len = 0;
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],i);
		}
		
		for(int num:arr){
			if(!hm.containsKey(num-1)){
				int a = num;
				int max = 1;
				while(hm.containsKey(a+1)){
					a++;
					max++;
				}
				
				len = Math.max(len,max);
			}
		}
		
		return len;
	}
}