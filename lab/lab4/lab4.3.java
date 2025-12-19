import java.util.Scanner;

class Player {

    private String username;
    private int level;

    public Player() {
        this.username = "Guest";
        this.level = 1;
    }

    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mode = sc.nextInt();
        sc.nextLine();

        Player p;

        if (mode == 1) {
            p = new Player();
        } else {
            String username = sc.nextLine();
            int level = sc.nextInt();
            p = new Player(username, level);
        }

        p.displayProfile();
    }
}
