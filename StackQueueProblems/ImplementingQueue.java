import java.util.*;
//using 2-stack approach........
public class ImplementingQueue{
	static Stack<Integer> st1 = new Stack<>();
    public static void add(int data) {
        Stack<Integer> st2 = new Stack<>();
        while (!st1.isEmpty()) {

            st2.push(st1.pop());
        }
        st2.push(data);
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }
    public int size() {
        return st1.size();
    }
    public void display() {
        while (!st1.isEmpty()) {
            System.out.print(st1.pop()+" ");
        }
    }
    public int remove() {
        if (st1.isEmpty()) {
            return -1;
        }
        return st1.pop();
    }
    public int peek() {
        return st1.peek();
    }
	public static void main(String args[]){
		ImplementingQueue q = new ImplementingQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        System.out.println();
        System.out.println("elemet present at front line is-> " + q.peek());
		System.out.print("the queue is -> ");
        q.display();
	}
}