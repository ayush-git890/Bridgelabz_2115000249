import java.util.*;
class Order {
    protected int orderId;
    protected String orderDate;
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderStatus() {
        return "Order " + orderId + " placed on " + orderDate + "";
    }
}
class ShippedOrder extends Order {
    protected String trackingNumber;
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order " + orderId + " has been shipped. Tracking Number: " + trackingNumber + "";
    }
}
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order " + orderId + " was delivered on " + deliveryDate + "";
    }
}
public class P6_MultilevelOrderManagement{
	public static void main(String args[]){
		Order o1 = new Order(000, "5-7-2025");
        ShippedOrder s1 = new ShippedOrder(111, "07-2-2025", "123456");
        DeliveredOrder d1 = new DeliveredOrder(222, "2025-02-01", "789456", "07-2-25");

        System.out.println(o1.getOrderStatus());
        System.out.println(s1.getOrderStatus());
        System.out.println(d1.getOrderStatus());
	}
}