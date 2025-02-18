import java.util.*;
abstract class WarehouseItem {//abstract class for extend item..
    private String name;
    private double price;
    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + getName() + ", "+getPrice();
    }
}
class Electronics extends WarehouseItem {
    public Electronics(String name, double price) {
        super(name, price);
    }
}
class Groceries extends WarehouseItem {
    public Groceries(String name, double price) {
        super(name, price);
    }
}
class Furniture extends WarehouseItem {
    public Furniture(String name, double price) {
        super(name, price);
    }
}

class Storage<T extends WarehouseItem> {//generic class for storage...
    private List<T> arr = new ArrayList<>();

    public void addItem(T item) {
        arr.add(item);
    }
    public List<T> getItems() {
        return arr;
    }
}
class WarehouseInfo {
    public static void displayItems(List<? extends WarehouseItem> items) {//wildcard method...
        for (WarehouseItem ele : items) {
            System.out.println(ele);
        }
    }
}
public class P1_SmartWarehouseSystem{
	public static void main(String args[]){
		Storage<Electronics> e = new Storage<>();
        Storage<Groceries> g = new Storage<>();
        Storage<Furniture> f = new Storage<>();
		
        e.addItem(new Electronics("Laptop", 120000));
        g.addItem(new Groceries("Apples", 100));
        f.addItem(new Furniture("Chair",10000));

        System.out.println("Electronics.............");
        WarehouseInfo.displayItems(e.getItems());

        System.out.println("Groceries...............");
        WarehouseInfo.displayItems(g.getItems());

        System.out.println("Furniture...............");
        WarehouseInfo.displayItems(f.getItems());
	}
}