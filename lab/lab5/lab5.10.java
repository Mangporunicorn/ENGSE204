import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String desc, int hours) {
        this.description = desc;
        this.baseHours = hours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String desc, int hours, double fee) {
        super(desc, hours);
        this.setupFee = fee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjectTask {

    public SimpleTask(String desc, int hours) {
        super(desc, hours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String complexDesc = sc.nextLine();
        int complexHours = sc.nextInt();
        double setupFee = sc.nextDouble();
        sc.nextLine();
        String simpleDesc = sc.nextLine();
        int simpleHours = sc.nextInt();

        ProjectTask task1 = new ComplexTask(complexDesc, complexHours, setupFee);
        ProjectTask task2 = new SimpleTask(simpleDesc, simpleHours);

        ProjectTask[] tasks = { task1, task2 };

        for (ProjectTask task : tasks) {
            System.out.println(task.calculateCost());
        }

        sc.close();
    }
}
