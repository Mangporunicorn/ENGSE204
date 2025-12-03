package lab2_2;
import java.util.Scanner;

class Student {
    String studentId;
    String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
        input.close();
    }
}

public class lab2_1 {
    public static void main(String[] args) {
        Student studentObject = new Student("6501001", "Somsak Jaidee");

        studentObject.displayInfo();
    }
}
