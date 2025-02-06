import java.util.*;
class Customer { // here we created Customer class...
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
	public String getName(){
		return name;
	}
    public void viewBalance() {
        System.out.println("Name --> " + name + ", total balance--> " + balance);
    }
}
public class Bank { // here we created Bank class...
    private String bankName;
    private List<Customer> arr; // here we created an ArrayList of Customer objects inside Bank...

    public Bank(String bankName) {
        this.bankName = bankName;
        this.arr = new ArrayList<>();
    }
    public void openAccount(Customer customer) {
        arr.add(customer);
        System.out.println("acocunt is opened for " + customer.getName() + " at " + bankName);
    }
    public void printCustomerData() {
        System.out.println("the bank name is " + bankName);
        for (Customer c : arr) {
            c.viewBalance();
        }
        System.out.println();
    }
	public static void main(String[] args) {
        Bank b1 = new Bank("Canara Bank");
        Bank b2 = new Bank("SBI");
        Customer c1 = new Customer("Ayush", 500000.00);
        Customer c2 = new Customer("Aditya", 7500.75);

        b1.openAccount(c1);
        b2.openAccount(c2);
		//it will print the data of customers in acoount...
        b1.printCustomerData();
        b2.printCustomerData();
    }
}