import java.util.*;
public class StockSpanProblem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);        
        System.out.print("enter no. of days here-> ");
        int n = sc.nextInt();       
        int[] arr = new int[n];
        System.out.println("enetr elements in an array-> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] span = calculateSpan(arr);
        System.out.println("these are the stock span for thses days--> ");
        for (int num : span) {
            System.out.print(num + " ");
        }
	}
	public static int[] calculateSpan(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();      
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return span;
    }
}