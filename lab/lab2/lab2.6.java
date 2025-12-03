package lab2_6;
import java.util.Scanner;

class BankAccount{
	private String ownerName;
	private double balance;
	
	public BankAccount(String ownerName,double balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void displaySummary() {
		System.out.println("Owner: "+ownerName);
		System.out.println("Balance: "+balance);
	}
}
public class lab2_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String inputOwnerName = input.nextLine();
		double inputInitialBalance = input.nextDouble();
		double inputDepositAmount = input.nextDouble();
		input.close();
		
		BankAccount account1 = new BankAccount(inputOwnerName,inputInitialBalance);
		account1.deposit(inputDepositAmount);
		
		account1.displaySummary();
		
	}

}
