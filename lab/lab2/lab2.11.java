package lab2_11;
import java.util.Scanner;

class Car{
	private String model;
    private int year;
    
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int newYear) {
        this.year = newYear;
    }
}
public class lab2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		String modelInput = input.nextLine();
		int YearOfManufacture = input.nextInt();
		int yearNew = input.nextInt();
        input.close();
        
        Car car = new Car(modelInput, YearOfManufacture);
        car.setYear(yearNew);
        
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
	}

}
