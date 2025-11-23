package lab1_14;
import java.util.Scanner;

public class lab1_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int R = input.nextInt();
        int C = input.nextInt();
        input.nextLine();

        char[][] map = new char[R][C];

        for (int i = 0; i < R; i++) {
            String line = input.nextLine().trim();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        int TargetR = input.nextInt();
        int TargetC = input.nextInt();

        if (map[TargetR][TargetC] == '*') {
            System.out.println("Mine");
        } else {
            int count = 0;
            for (int dr = -1; dr <= 1; dr++) {
                for (int dc = -1; dc <= 1; dc++) {
                    if (dr == 0 && dc == 0) continue;
                    int newR = TargetR + dr;
                    int newC = TargetC + dc;

                    if (newR >= 0 && newR < R && newC >= 0 && newC < C) {
                        if (map[newR][newC] == '*') {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
        input.close();
    }
}
