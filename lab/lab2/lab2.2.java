package lab2_2;
import java.util.Scanner;

class Student{
	private String studentID;
	private String name;
	
	public Student(String studentID,String name) {
		this.studentID = studentID;
		this.name = name;
	}
	public void displayInfo() {
        System.out.println("Student ID :"+studentID);
        System.out.println("Name :"+name);
    }
}	
public class lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		String studentID = input.nextLine();
		String name = input.nextLine();
		
		input.close();
		
		Student student1 = new Student(studentID, name);
		
		student1.displayInfo();
		
	}

}
