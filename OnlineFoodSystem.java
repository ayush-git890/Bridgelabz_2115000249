import java.util.*;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    private FoodItem next;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public abstract double calculateTotalPrice();
    public String getItemDetails() {
        return "Item--> " + getItemName() + ", Price--> " + getPrice() + ", Quantity--> " + getQuantity();
    }
    public FoodItem getNext() {
        return next;
    }
    public void setNext(FoodItem next) {
        this.next = next;
    }
}
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.2;
    }
    @Override
    public String getDiscountDetails() {
        return "20% applied!!!!!!!!!!!!!!!!!!!!!";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private static final double additionalCharge = 40.0;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.09;
    }
    @Override
    public String getDiscountDetails() {
        return "9% discount applied";
    }
}
public class OnlineFoodSystem{
	public static void main(String args[]){
		VegItem a = new VegItem("pizza", 200, 2);
        NonVegItem b = new NonVegItem("shwarma", 2000, 1);
        a.setNext(b);
        FoodItem flag = a;
        while (flag != null) {
            System.out.println(flag.getItemDetails());
            System.out.println("total amount--> " + flag.calculateTotalPrice());

            if (flag instanceof Discountable) {
                Discountable discountableItem = (Discountable) flag;
                System.out.println("siscount-> " + discountableItem.applyDiscount());
                System.out.println(discountableItem.getDiscountDetails());
            }
            flag = flag.getNext();
        }
	}
}