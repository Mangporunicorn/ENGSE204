package lab2_1;
import java.util.Scanner;

class Student {
    String studentId;
    String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
}

public class lab2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String studentId = input.nextLine();
        String name = input.nextLine();

        Student studentObject = new Student(studentId, name);

        System.out.println("ID: "+studentObject.studentId);
		System.out.println("Name: "+studentObject.name);

        input.close();
    }
}
