import java.util.*;
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited-> " + amount + " new balance-> " + balance);
        } else {
            System.out.println("");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdraw-> " + amount + " new balance-> " + balance);
        } else {
            System.out.println("");
        }
    }
    public abstract double calculateInterest();

    public void printData() {
        System.out.println("acc. number--> " + getAccountNumber()+" holder name--> " + getHolderName()+" bal--> " + getBalance()+" interest--> " + calculateInterest());
        System.out.println("===============================================");
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
class SavingsAccount extends BankAccount {
    private static final double interestRate = 0.04; // 4% interest per year
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    private static final double interestRate = 0.02; // 2% interest per year
    private static final double LEF = 5;
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.println(getHolderName() + " applied for a loan-> " + amount + " -> Approved");
        } else {
            System.out.println(getHolderName() + " applied for a loan-> " + amount + " -> cancelled");
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LEF;
    }
}
public class BankingSystem{
	public static void main(String args[]){
		List<BankAccount> arr = new ArrayList<>();
        arr.add(new SavingsAccount("1234", "Ayush", 50000));
        arr.add(new CurrentAccount("7894", "rohit", 10000));
        for (BankAccount account : arr) {
            account.printData();
        }
        arr.get(0).deposit(1000);
        arr.get(0).withdraw(2000);

        if (arr.get(1) instanceof Loanable) {
            ((Loanable) arr.get(1)).applyForLoan(20000);
        }
	}
}