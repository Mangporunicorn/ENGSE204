import java.util.Scanner;

class Employee {
    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {

    @Override
    public double calculateBonus() {
        double baseBonus = super.calculateBonus();
        return baseBonus + (salary * 0.05);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        Manager m = new Manager();
        m.salary = salary;

        double bonus = m.calculateBonus();
        System.out.println(bonus);
    }
}
