import java.util.*;
public class P4_ImplementStack{
	private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int topElement = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topElement;
    }

    public int top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int topElement = q1.peek();
        q2.add(q1.remove());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topElement;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
	public static void main(String args[]){
		P4_ImplementStack st = new P4_ImplementStack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("Top--> " + st.top());
        System.out.println("Pop--> " + st.pop());
        System.out.println("Top-->  " + st.top());
	}
}