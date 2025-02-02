import java.util.*;
class Product {
    private String productName;
    private double price;
    //it is shared will all insances...
    private static int totalItem = 0;
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalItem++; //whenever the product iscreated it will incremented....
    }
    public void displayProductDetails() {
        System.out.println("here is the product " + productName);
        System.out.println("with price " + price);
    }

    // Class Method: Displays total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products in Inventory: " + totalItem);
    }
}
public class ProductInventory{
	public static void main(String args[]){
		Product p1 = new Product("Laptop", 100000);
        Product p2 = new Product("Smartphone", 50000);
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
	}
}