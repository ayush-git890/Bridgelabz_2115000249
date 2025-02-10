import java.util.*;
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
abstract class Product { // Abstract Product class with encapsulation
    private String productId;
    private String name;
    private double price;
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public abstract double calculateDiscount();
    public double getFinalPrice() {//to get final price (price + tax - discount)
        double dis = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        return price + tax - dis;
    }
    public void printData() {
        System.out.println("prod. id--> " + getProductId()+" name--> " + getName()+" price--> " + getPrice()+" dicount-> " + calculateDiscount());

        if (this instanceof Taxable) {
            System.out.println(((Taxable) this).getTaxDetails());
        }
        System.out.println("total price--> " + getFinalPrice());
    }
    public String getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("price can not be ve here--> ");
        }
    }
}
class Electronics extends Product implements Taxable {//implementing Taxable interface
    private static final double taxRate = 0.30;//its means that i giving 30% tax....
    private static final double disRate = 0.15;//i am giving 15%  discount.....
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * disRate;
    }
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
    @Override
    public String getTaxDetails() {
        return "tax rate--> 30% -- tax amount--> " + calculateTax();
    }
}
class Clothing extends Product implements Taxable {
    private static final double taxRate = 0.10;
    private static final double disRate = 0.20;
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * disRate;
    }
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
    @Override
    public String getTaxDetails() {
        return "Tax Rate--> 10% -- tax amount--> " + calculateTax();
    }
}
class Groceries extends Product {
    private static final double disRate = 0.20; // 20% discount
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * disRate;
    }
}
public class EcommercePlatform{
	public static void main(String args[]){
		List<Product> arr = new ArrayList<>();
        arr.add(new Electronics("1234", "phone", 8000));
        arr.add(new Clothing("4561", "laptop", 50));
        arr.add(new Groceries("7894", "tablet", 10));
        for (Product p : arr) {
            p.printData();
            System.out.println("===========by ayush agarwal===============");
        }
	}
}