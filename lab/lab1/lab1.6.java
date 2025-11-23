package lab1_6;
import java.util.Scanner;
public class lab1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for (int i = 1; i <= 12; i++) {
			System.out.println(+number+"x"+i+"="+ (number*i));
		}
		input.close();
	}

}
