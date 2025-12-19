import java.util.Scanner;

class ImmutableAccount {

    private final String accountId;
    private final double balance;

    public ImmutableAccount(String accountId, double balance) {
        this.accountId = accountId;

        if (balance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    public ImmutableAccount(ImmutableAccount other) {
        this.accountId = other.accountId;
        this.balance = other.balance;
    }

    // Getter
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public ImmutableAccount deposit(double amount) {
        if (amount > 0) {
            return new ImmutableAccount(accountId, balance + amount);
        } else {
            System.out.println("Invalid deposit amount.");
            return this;
        }
    }

    public ImmutableAccount withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
            return this;
        } else {
            return new ImmutableAccount(accountId, balance - amount);
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + accountId + ", Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();
        double startBalance = sc.nextDouble();
        double depositAmount = sc.nextDouble();
        double withdrawAmount = sc.nextDouble();

        ImmutableAccount acc1 = new ImmutableAccount(id, startBalance);

        ImmutableAccount acc2 = acc1.deposit(depositAmount);

        ImmutableAccount acc3 = acc2.withdraw(withdrawAmount);

        acc1.displayInfo();
        acc3.displayInfo();
    }
}
