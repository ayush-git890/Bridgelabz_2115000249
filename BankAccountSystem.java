import java.util.*;
class BankAccount {
    private static String bankName = "SBI";
    private static int count = 0;// it will calculate total amount....
    private final int accountNumber;//it cannot be changed....
    private String accountHolderName;
    private double bal;

    public BankAccount(int accountNumber, String accountHolderName, double bal) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.bal = bal;
        count++; // increment total accounts while creation
    }
    public void printData() {
        if (this instanceof BankAccount) {
            System.out.println("your bank name is---> " + bankName);
            System.out.println("Acc. Num:- " + accountNumber);
            System.out.println("Holder name--> " + accountHolderName);
            System.out.println("available balance--> " + bal);
        }
    }
    public static void getTotalAccounts() { // here i am using static method to display total count...
        System.out.println("the total account is-->  " + count);
    }
}
public class BankAccountSystem{
	public static void main(String args[]){
		BankAccount b1 = new BankAccount(1234, "Ayush", 100000);
        BankAccount b2 = new BankAccount(4567, "Rohan", 20000);
        b1.printData();
		System.out.println("======================================");
        b2.printData();
        BankAccount.getTotalAccounts();
	}
}