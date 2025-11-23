package lab1_13;
import java.util.Scanner;
public class Lab1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		int C = input.nextInt();
		
		int[][] grid = new int[R][C];
		
		for(int i = 0;i<R;i++) {
			for(int j=0;j<C;j++) {
				grid[i][j] = input.nextInt();
			}
		}
		int onlineCount = 0;
		for (int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(grid[i][j]==1) {
					onlineCount++;
			}
		}
	}
		System.out.println(onlineCount);
		input.close();
	}
}
