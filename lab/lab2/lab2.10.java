package lab2_10;
import java.util.Scanner;

class Product{
	private String name;
	private double price;
	
	public Product(String name,double price) {
		this.name = name;
        this.price = price;
	}
    public double getPrice() {
        return price;
    }
}
class ShoppingCart{
	private Product[] items;
	private int itemCount;
	
	public ShoppingCart() {
		this.items = new Product[10];
		this.itemCount = 0;
	}
	public void addProduct(Product p) {
		if (itemCount < items.length) {
			items[itemCount] = p;
			itemCount++;
		}
	}
	public double calculateTotalPrice() {
        double totalPrice = 0.0;
        
        for (int i = 0; i < itemCount; i++) {
        	totalPrice += items[i].getPrice(); 
        }
        return totalPrice;
        }
}

public class lab2_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = 0;
		if (input.hasNextInt()) {
      N = input.nextInt();
		}
    input.nextLine();
        
		ShoppingCart cart = new ShoppingCart();
		
		for (int i = 0; i < N; i++) {
		  String productName = input.nextLine();
      double productPrice = input.nextDouble();
    
      if (i < N - 1) {
        input.nextLine();
      }
			
			Product newProduct = new Product(productName, productPrice);
			cart.addProduct(newProduct);
		}
		
		double finalPrice = cart.calculateTotalPrice();
		System.out.printf("%.1f%n", finalPrice);
		input.close();
	}
}
