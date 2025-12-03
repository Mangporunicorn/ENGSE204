package lab2_12;
import java.util.Scanner;

class Course {
    private String courseID;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
    }

    public String getCourseInfo() {
        return courseID + ": " + courseName;
    }
}

class Student {
    private String studentName;
    private Course enrolledCourse;

    public Student(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}

public class lab2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String courseID = input.nextLine();
        String courseName = input.nextLine();
        String studentName = input.nextLine();
        
        Course course = new Course(courseID, courseName);
        Student student = new Student(studentName, course);
        
        student.displayEnrollment();
        input.close();
    }
}
