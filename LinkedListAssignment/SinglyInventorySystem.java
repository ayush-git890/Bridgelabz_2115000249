import java.util.*;
class InventoryNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    InventoryNode next;
    public InventoryNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryManagement {
    private InventoryNode head;
    public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        InventoryNode nn = new InventoryNode(itemName, itemId, quantity, price);
        nn.next = head;
        head = nn;
    }
    public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        InventoryNode nn = new InventoryNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = nn;
            return;
        }
        InventoryNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
    }
    public void deleteItem(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        InventoryNode temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    public void updateQuantity(int itemId, int newQuantity) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }
    public InventoryNode findItem(int itemId) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void displayInventory() {
        InventoryNode temp = head;
        while (temp != null) {
            System.out.println("Item ID: " + temp.itemId + ", Name: " + temp.itemName + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    public double calculateTotalValue() {
        double c = 0;
        InventoryNode temp = head;
        while (temp != null) {
            c += temp.quantity * temp.price;
            temp = temp.next;
        }
        return c;
    }
}
public class SinglyInventorySystem{
	public static void main(String args[]){
		InventoryManagement ll = new InventoryManagement();
        ll.addItemAtBeginning("laptop", 1, 5, 75000);
        ll.addItemAtEnd("phone", 2, 10, 50000);
        ll.addItemAtEnd("tab", 3, 7, 30000);
		System.out.println("these are the data of inventory............");
        ll.displayInventory();
		System.out.println("here i updated data 2 to 15............");
        ll.updateQuantity(2, 15);//to update...  
		System.out.println("here i deleted data of 2............");
        ll.deleteItem(2);
        System.out.println("final inventory value is --> " + ll.calculateTotalValue());
	}
}