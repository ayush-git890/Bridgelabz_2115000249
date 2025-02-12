import java.util.*;
class TextNode {
    String text;
    TextNode prev, next;
    public TextNode(String text) {
        this.text = text;
        this.prev = this.next = null;
    }
}
class TextEditor {
    private TextNode head, tail, curr;
    private final int flag = 10;
    private int size = 0;
    public TextEditor() {
        head = tail = curr = null;
    }
    public void addState(String newText) {
        TextNode nn = new TextNode(newText);
        if (head == null) {
            head = tail = curr = nn;
        } else {
            curr.next = nn;
            nn.prev = curr;
            curr = nn;
            tail = nn;
        }
        size++;
        if (size > flag) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void undo() {
        if (curr != null && curr.prev != null) {
            curr = curr.prev;
            System.out.println("Undo: curr state -> " + curr.text);
        } else {
            System.out.println("no more undo............");
        }
    }
    public void redo() {
        if (curr != null && curr.next != null) {
            curr = curr.next;
            System.out.println("Redo: curr state -> " + curr.text);
        } else {
            System.out.println("no more redo................");
        }
    }
    public void printCurrState() {
        if (curr != null) {
            System.out.println("curr Text: " + curr.text);
        } else {
            System.out.println("no text...........");
        }
    }
}
public class DoublyUndoRedo{
	public static void main(String[] args) {
        TextEditor ll = new TextEditor();
        ll.addState("Ayush");
        ll.addState("Ayush Agarwal");
		System.out.println("diplaying current state.....");
        ll.printCurrState();
        ll.undo();
        ll.redo();
    }
}