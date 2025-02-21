import java.util.*;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String str) {
        super(str);
    }
}
class Bank {
    private double bal;

    public Bank(double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("balance can not be -ve....");
        this.bal = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0)
            throw new IllegalArgumentException("Invalid amount!");
        if (amount > bal)
            throw new InsufficientBalanceException("Insufficient balance!");
        bal -= amount;
        System.out.println("Withdrawal successful, new balance: " + bal);
    }
}
public class P10_BankTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter your initial balance here--> ");
            double bal = sc.nextDouble();
            Bank account = new Bank(bal);

            System.out.print("enter withdraw money here--> ");
            double amount = sc.nextDouble();
            account.withdraw(amount);

        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}