package lab2_8;
import java.util.Scanner;

class TempConverter{
	public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }
}

public class lab2_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String mode = input.nextLine();
    double temperature = input.nextDouble();
        
        double result = 0.0;
        if (mode.equals("C_TO_F")) {
        	result = TempConverter.celsiusToFahrenheit(temperature);
        } else if (mode.equals("F_TO_C")) {
        	result = TempConverter.fahrenheitToCelsius(temperature);
        }
        System.out.println("Result: "+result);
}
}
