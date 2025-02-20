import java.util.*;
public class P5_CircularBufferSimulation{
	private int[] buffer;
    private int head, tail, size, capacity;
    public P5_CircularBufferSimulation(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void enqueue(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
        if (size < capacity) {
            size++;
        } else {
            head = (head + 1) % capacity;
        }
    }

    public int[] getBuffer() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = buffer[(head + i) % capacity];
        }
        return result;
    }
	public static void main(String args[]){
		P5_CircularBufferSimulation cbs = new P5_CircularBufferSimulation(3);
        cbs.enqueue(1);
        cbs.enqueue(2);
        cbs.enqueue(3);
        System.out.println("Buffer: " + Arrays.toString(cbs.getBuffer()));
        cbs.enqueue(4);
        System.out.println("Buffer: " + Arrays.toString(cbs.getBuffer()));
	}
}