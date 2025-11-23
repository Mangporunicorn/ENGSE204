package lab1_3;
import java.util.Scanner;
public class lab1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number % 2 == 0) {
			System.out.println("This number is Even");
		} else {
			System.out.println("This number is Odd");
		}
	}

}
