import java.util.*;
public class P5_RecursiveIterativeFibonacci{
	public static void main(String args[]){
		int fibonacci[] = {10,30,50};
		for(int n:fibonacci){
			
			//for recursive....
			long initialRecursiveTime = System.nanoTime();
			fibonacciRecursive(n);
			long calculateRecursiveTime = (System.nanoTime()-initialRecursiveTime);
			double finalRecursiveTime = calculateRecursiveTime/1000000.0;
			
			// for iterative...
			long initialIterativeTime = System.nanoTime();
			fibonacciIterative(n);
			long calculateIterativeTime = (System.nanoTime()-initialIterativeTime);
			double finalIterativeTime = calculateIterativeTime/1000000.0;
			
			System.out.println("the time taken for "+n+" in iterative is-> "+finalIterativeTime+" and in recursive is-> "+finalRecursiveTime);
		}
	}
	public static int fibonacciIterative(int n) {
		int a = 0, b = 1, sum;
		for (int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}
	public static int fibonacciRecursive(int n) {
		if (n <= 1) return n;
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
}