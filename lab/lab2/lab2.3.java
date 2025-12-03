package lab2_3;
import java.util.Scanner;

class Student {

    private String studentId;
    private String name;

    public static int studentCount = 0; 

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
      
        Student.studentCount++; 
    }
}

public class lab2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        int N = input.nextInt(); 
        input.nextLine(); 

        for (int i = 0; i < N; i++) {
            String studentId = input.nextLine();
            String name = input.nextLine(); 
            Student newStudent = new Student(studentId, name);
                        
        }

        System.out.println("Student.studentCount : " + Student.studentCount);

        input.close();
    }
}
