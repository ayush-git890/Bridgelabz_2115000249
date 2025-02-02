import java.util.*;
class BankAccount {
    public String accountNumber; 
    protected String accountHolder;
    private double balance;
    public BankAccount() {
        this.accountNumber = "";
        this.accountHolder = "";
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {  //to update balance in subclass
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    public void displayAccount() {
        System.out.println("Acc.. Number--> " + accountNumber);
        System.out.println("Acc. holder name--> " + accountHolder);
        System.out.println("balance---> " + balance);
    }
}
class SavingsAccount extends BankAccount {
    public double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.setBalance(balance);             
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("saving account of " + accountHolder + " Account: " + accountNumber);
    }
}
public class BankAccountManagement{
	public static void main(String args[]){
		BankAccount a1 = new BankAccount("123456", "Ayush", 50000);
        a1.displayAccount();
        SavingsAccount s1 = new SavingsAccount("234565", "Rohit agarwal", 7000, 3);
        s1.displaySavingsDetails();
	}
}