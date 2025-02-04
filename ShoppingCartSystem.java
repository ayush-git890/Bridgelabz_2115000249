import java.util.*;
class Product {
    private static double discount = 20;// it will shared to all....
    private final int p_ID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int p_ID, String productName, double price, int quantity) {
        this.p_ID = p_ID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public void printData() {
        if (this instanceof Product) {
            System.out.println("Your product id is---> " + p_ID);
            System.out.println("product name is---> " + productName);
            System.out.println("price is--> " + price);
            System.out.println("total qty. -> " + quantity);
            System.out.println("the discount we provided you is --> " + discount + "%");
            System.out.println();
        }
    }
    public static void updateDiscount(double newDiscount) { //here we updated the discount....
        discount = newDiscount;
        System.out.println("here is your final discount as per your demand--> " + discount + "%");
    }
}
public class ShoppingCartSystem{
	public static void main(String args[]){
        Product p1 = new Product(123, "Smartphone", 25000, 5);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the discount you want--->");
		double dis = sc.nextDouble();
        p1.printData();
		System.out.println("==================================");
        //after update......
        Product.updateDiscount(dis);
        p1.printData();
	}
}