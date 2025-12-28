import java.util.Scanner;

class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String physicalName = sc.nextLine();
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        sc.nextLine();

        String digitalName = sc.nextLine();
        double monthlyCost = sc.nextDouble();
        int months = sc.nextInt();

        Item item1 = new PhysicalProduct(physicalName, unitPrice, quantity);
        Item item2 = new DigitalSubscription(digitalName, monthlyCost, months);

        Item[] items = { item1, item2 };

        double totalValue = 0.0;
        for (Item item : items) {
            totalValue += item.getValue();
        }

        // 4. Output
        System.out.println(totalValue);

        sc.close();
    }
}
