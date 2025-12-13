import java.util.Scanner;

class InventoryItem {

    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;

        if (initialStock >= 0) {
            stock = initialStock;
        } else {
            stock = 0;
        }
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            stock = stock + amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount <= stock) {
            stock = stock - amount;
            System.out.println("Sale successful.");
        } else {
            System.out.println("Not enough stock.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int startStock = sc.nextInt();

        InventoryItem item = new InventoryItem(name, startStock);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            int amount = sc.nextInt();

            if (command.equals("ADD")) {
                item.addStock(amount);
            } else if (command.equals("SELL")) {
                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + item.getStock());
    }
}
