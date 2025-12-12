package lab3_12;

import java.util.Scanner;

class Employee {
    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0;
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class lab3_12 {

    private static Employee createEmployeeFromInput(Scanner sc) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter tax rate: ");
        double taxRate = sc.nextDouble();

        System.out.print("Enter raise amount: ");
        double raise = sc.nextDouble();

        Employee emp = new Employee(name, salary);

        System.out.println("Tax (Before): " + emp.calculateTax(taxRate));
        emp.giveRaise(raise);
        System.out.println("Tax (After): " + emp.calculateTax(taxRate));

        return emp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        createEmployeeFromInput(input);
    }
}
