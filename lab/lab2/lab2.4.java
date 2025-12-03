package lab2_4;
import java.util.Scanner;

class Student{
	private String name;
	private int midtermScore;
	private int finalScore;
	
	public Student(String name,int midtermScore ,int finalScore) {
		this.name = name;
		this.midtermScore = midtermScore;
		this.finalScore = finalScore;
	}
	
	public double calculateAverage() {
		return (midtermScore + finalScore)/2;
	}
	
	public void displaySummary() {
		double averageScore = calculateAverage();
		String status;
		
		if(averageScore >= 50) {
			status = "Pass";
		} else {
			status = "Fall";
		}
		System.out.println("Name: "+name);
		System.out.println("Average Score: "+avg);
		System.out.println("Status"+ status);
	}
}
package lab2_4;
import java.util.Scanner;

class Student{
	private String name;
	private int midtermScore;
	private int finalScore;
	
	public Student(String name,int midtermScore ,int finalScore) {
		this.name = name;
		this.midtermScore = midtermScore;
		this.finalScore = finalScore;
	}
	
	public double calculateAverage() {
		return (midtermScore + finalScore)/2;
	}
	
	public void displaySummary() {
		double averageScore = calculateAverage();
		String status;
		
		if(averageScore >= 50) {
			status = "Pass";
		} else {
			status = "Fall";
		}
		System.out.println("Name: "+name);
		System.out.println("Average Score: "+averageScore);
		System.out.println("Status"+ status);
	}
}


public class lab2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String inputName = input.nextLine();
		int inputMidterm = input.nextInt();
		int inputFinal = input.nextInt();
		
		Student student1 = new Student(inputName, inputMidterm, inputFinal);
		input.close();
		student1.displaySummary();
	}

}


public class lab2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String inputName = input.nextLine();
		int inputMidterm = input.nextInt();
		int inputFinal = input.nextInt();
		
		Student student1 = new Student(inputName, inputMidterm, inputFinal);
		input.close();
		student1.displaySummary();
	}

}
