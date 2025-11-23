package lab1_7;
import java.util.Scanner;
public class lab1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N =input.nextInt();
		int sum = 0;
		for (int i=1;i<=N;i++) {
			int Number = input.nextInt();
			sum += Number;
		}
		System.out.println(sum);
		input.close();
	}
}
a
