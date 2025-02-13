import java.util.*;
public class SlidingWindowMaximum{
	public static int[] slidingWindow(int[] arr, int k) {
        if (arr.length == 0) return new int[0];
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }

            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if (i >= k - 1) {
                ans[i - k + 1] = arr[dq.peek()];
            }
        }

        return ans;
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of an array-> ");
        int n = sc.nextInt();       
        int[] arr = new int[n];
        System.out.println("enter a elements in an array-> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter a size of window-> ");
        int k = sc.nextInt();
        int[] num = slidingWindow(arr, k);
        System.out.println("Maximum elements in each window are-> ");
        for (int a : num) {
            System.out.print(a + " ");
        }
	}
}