import java.util.*;
public class P1_ReverseAQueue{
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("our Original Queue--> " + q);
        reverseQueue(q);
        System.out.println("our Reversed Queue----> " + q);
	}
	public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }
}