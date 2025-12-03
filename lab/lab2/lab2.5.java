package lab2_5;
import java.util.Scanner;

class Rectangle{
	private double width;
	private double height;
	
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2 * (width + height);
	}
}

public class lab2_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double inputWidth = input.nextDouble();
		double inputHeight = input.nextDouble();
		input.close();
		
		Rectangle rectangle1 = new Rectangle(inputWidth,inputHeight);
		
		double area = rectangle1.getArea();
		double perimeter = rectangle1.getPerimeter();
		
		System.out.println("Area: "+area);
		System.out.println("Perimeter: "+perimeter);
	}

}
