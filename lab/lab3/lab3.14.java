package lab3_14;

import java.util.Scanner;

class BankAccount {

    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit) {
        balance = (initialDeposit >= 0) ? initialDeposit : 0;
        System.out.println("Account created.");
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        balance += amount;
        totalTransactionCount++;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        totalTransactionCount++;
        System.out.println("Withdrawal successful.");
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class lab3_14 {

    private static void executeCommand(String cmd, Scanner sc, BankAccount account[]) {

        switch (cmd) {
            case "CREATE" -> {
                System.out.println("Enter initial deposit: ");
                double init = sc.nextDouble();
                sc.nextLine();
                account[0] = new BankAccount(init);
            }

            case "DEPOSIT" -> {
                if (account[0] == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Enter amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    account[0].deposit(amt);
                }
            }

            case "WITHDRAW" -> {
                if (account[0] == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Enter amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    account[0].withdraw(amt);
                }
            }

            case "STATUS" -> {
                if (account[0] == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Balance: " + account[0].getBalance());
                }
            }

            case "GLOBAL_STATUS" ->
                System.out.println("Total Transactions: " +
                        BankAccount.getTotalTransactionCount());

            default -> System.out.println("Invalid command.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankAccount[] myAccount = new BankAccount[1];

        System.out.println("Enter number of commands: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter command: ");
            String command = input.nextLine().trim();
            executeCommand(command, input, myAccount);
        }

        input.close();
    }
}
