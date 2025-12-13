import java.util.Scanner;

class Employee {

    private String employeeId;
    private String department;

    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();
        String oldDept = sc.nextLine();
        String newDept = sc.nextLine();

        Employee emp = new Employee(id, oldDept);

        emp.setDepartment(newDept);

        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getDepartment());
    }
}
