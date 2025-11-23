package lab1_12;
import java.util.Scanner; 
public class lab1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		int[] productId = new int[N];
		int[] productQty = new int[N];
		
		for (int i = 0;i<N;i++) {
			productId[i] = input.nextInt();
			productQty[i] = input.nextInt();
		}
		int searchId = input.nextInt();
		
		boolean foundStock = false;
        for (int i = 0; i < N; i++) {
            if (productId[i] == searchId) {
                System.out.println("Stock Quantity:"+productQty[i]);
                foundStock = true;
                break;
			}
		}
		if(!foundStock) {
			System.out.println("Product"+ searchId +"not found");
		}
	}
}

