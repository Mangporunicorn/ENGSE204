import java.util.Scanner;

class User {

    private String password; 

    public User(String initialPassword) {
        this.password = initialPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {

        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String initialPassword = sc.nextLine();

        String newPassword = sc.nextLine();

        User u = new User(initialPassword);

        u.setPassword(newPassword);

        System.out.println(u.getPassword());
    }
}
