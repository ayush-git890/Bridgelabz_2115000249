import java.util.*;
class Product { // product class representing items in the store
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
}
class Order { // order class containing multiple Products
    private List<Product> arr;
    private double totalAmount;
    public Order() {
        this.arr = new ArrayList<>();
        this.totalAmount = 0;
    }
    public void addProduct(Product product) { // adding a product to an order
        arr.add(product);
        totalAmount += product.getPrice();
    }
    public void displayOrderDetails() {
        System.out.println("Products Ordered:");
        for (Product p : arr) {
            System.out.println("-> " + p.getProductName() + " (" + p.getPrice() + ")");
        }
        System.out.println("Total Amount:" + totalAmount);
        System.out.println();
    }
}
class Customer { // Customer class placing multiple orders (Association)
    private String customerName;
    private List<Order> arr1;
    public Customer(String customerName) {
        this.customerName = customerName;
        this.arr1 = new ArrayList<>();
    }
    public void placeOrder(Order order) { // Customer places an order
        arr1.add(order);
        System.out.println(customerName + " has placed a new order ");
    }
    public void viewOrders() { // Viewing all orders by the customer
        System.out.println("Customer: " + customerName);
        System.out.println("Order History:");
        for (Order o : arr1) {
            o.displayOrderDetails();
        }
    }
}
public class Ecommerce{
    public static void main(String[] args) {
        // creating products object
        Product p1 = new Product("Laptop", 50000);
        // creating customers object
        Customer customer1 = new Customer("Ayush Agarwal");
        // creating orders and adding products
        Order order1 = new Order();
        order1.addProduct(p1);
        // Customers placing orders
        customer1.placeOrder(order1);
        // Viewing order history
        System.out.println("\nOrder Summary:");
        customer1.viewOrders();
    }
}
