package lab1_9;
import java.util.Scanner;
public class lab1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N =input.nextInt();
		double sum = 0;
		double result = 0;
		for (int i=1;i<=N;i++) {
			double Number = input.nextDouble();
			result = (sum += Number)/i;
		}
		System.out.println(result);
		input.close();
	}

}
