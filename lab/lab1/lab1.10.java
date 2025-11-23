package lab1_10;
import java.util.Scanner;
public class lab1_10 {

	public static double calculateArea(double width,double height) {
		return width * height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double width = input.nextDouble();
    
		double height = input.nextDouble();
		
		input.close();
		
		double sum = calculateArea(width,height);
		
		System.out.println(sum);
	}

}
