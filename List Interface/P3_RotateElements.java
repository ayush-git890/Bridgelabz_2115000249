import java.util.*;
public class P3_RotateElements{
	public static void main(String args[]){
		List<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("your original list is--> "+arr);
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number for rotation--> ");
		int n = sc.nextInt();
		
		System.out.println("the rotated list after shifting "+n+"th time--> "+rotate(arr,n));
	}
	public static List<Integer> rotate(List<Integer> arr,int n){
		int l = arr.size();
		n = n % l;

		List<Integer> ans = new ArrayList<>();
		ans.addAll(arr.subList(n, l));
		ans.addAll(arr.subList(0, n));

		return ans;
	}
}