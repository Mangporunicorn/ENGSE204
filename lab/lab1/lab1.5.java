package lab1_5;
import java.util.Scanner;
public class lab1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int menuNumber = input.nextInt();
		
		switch(menuNumber) {
			case 1 :
				System.out.println("Americano");
				break;
			case 2 :
				System.out.println("Latte");
				break;
			case 3 :
				System.out.println("Espresso");
				break;
			case 4 :
				System.out.println("Mocha");
				break;
			default:
				System.out.println("Invalid Menu");
				break;
		}
		input.close();
	}

}
