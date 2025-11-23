package lab1_4;
import java.util.Scanner;
public class lab1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int Score = input.nextInt();
		
		if (Score >= 80) {
			System.out.print("A");
		}else if  (Score >= 70) {
			System.out.print("B");	
		}else if (Score >= 60) {
			System.out.print("C");
		}else if (Score >= 50) {
			System.out.print("D");
		}else if (Score < 50 ) {
			System.out.print("F");
		}
		input.close();
	}
}
