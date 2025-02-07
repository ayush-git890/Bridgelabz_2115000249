import java.util.*;
class BankAccount { // Superclass
    String accountNumber;
    double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountInfo() {
        System.out.println("acc. num: " + accountNumber+" balance" + balance);
    }
}
class SavingsAccount extends BankAccount {//it is our sub class that is Saving acount..
    double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("ssavings account"+" IR: " + interestRate + "");
    }
}
class CheckingAccount extends BankAccount {// CheckingAccount subclass
    double withdrawalLimit;
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Checking Account"+" Withdrawal Limit:" + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {// FixedDepositAccount subclass
    int depositTerm;
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}
public class P8_HierarchicalBankAccount{
	public static void main(String args[]){
		SavingsAccount s = new SavingsAccount("123456", 10000, 1);
        CheckingAccount c = new CheckingAccount("789456", 1000, 500);
        FixedDepositAccount f = new FixedDepositAccount("147852", 80000, 10);
        System.out.println("=========================================");
        s.displayAccountInfo();
        System.out.println("==========================================");
        c.displayAccountInfo();
        System.out.println("========================================");
        f.displayAccountInfo();
	}
}