import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    protected double commissionRate;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Manager extends Employee {
    protected double fixedBonus;

    public Manager(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Employee e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String salesName = sc.nextLine();
        double salesSalary = sc.nextDouble();
        double rate = sc.nextDouble();
        sc.nextLine();

        String managerName = sc.nextLine();
        double managerSalary = sc.nextDouble();
        double bonus = sc.nextDouble();

        Employee sales = new SalesEmployee(salesName, salesSalary, rate);
        Employee manager = new Manager(managerName, managerSalary, bonus);

        PayrollProcessor.process(sales);
        PayrollProcessor.process(manager);
    }
}
