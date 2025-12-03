package lab2_7;
import java.util.Scanner;

class BankAccount {
	private String ownerName;
    private double balance;
    
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
}
    public void withdraw(double amount) {
    	if (this.balance >= amount) {
    		this.balance -= amount;
    		System.out.println("Withdrawal successful.");
        } else {
        	System.out.println("Withdrawal Insufficient funds.");
        }
    }
    	public void displayBalance() {
    		System.out.println("Balance: " + this.balance);
    	}
    }

public class lab2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String inputOwnerName = input.nextLine();
		double inputInitialBalance = input.nextDouble();
		double inputWithdrawal1 = input.nextDouble();
		double inputWithdrawal2 = input.nextDouble();
		
		BankAccount account = new BankAccount(inputOwnerName, inputInitialBalance);
		account.withdraw(inputWithdrawal1);
		account.withdraw(inputWithdrawal2);
		
		account.displayBalance();
		input.close();
	}

}
