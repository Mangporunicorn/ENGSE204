package lab3_9;

import java.util.Scanner;

class User {

    private String username;
    private String password;

    private static int minPasswordLength = 8;

    public User(String username, String password) {
        this.username = username;
        setInitialPassword(password);
    }

    private void setInitialPassword(String password) {
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    public static void setMinLength(int length) {
        if (length >= 4) {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        } else {
            System.out.println("Invalid length.");
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
    }
}

public class lab3_9 {

    private static User createUser(Scanner sc, String label) {
        System.out.println("Enter " + label + " name: ");
        String name = sc.nextLine();

        System.out.println("Enter " + label + " password: ");
        String pass = sc.nextLine();

        return new User(name, pass);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter minLength: ");
        User.setMinLength(input.nextInt());
        input.nextLine();

        User user1 = createUser(input, "user1");
        User user2 = createUser(input, "user2");

        System.out.println("Enter minLength: ");
        User.setMinLength(input.nextInt());
        input.nextLine();

        System.out.println("Enter user2 new password: ");
        String newPass = input.nextLine();
        user2.setPassword(newPass);

        System.out.println("Password User1 Is: " + user1.getPassword());
        System.out.println("Password User2 Is: " + user2.getPassword());

        input.close();
    }
}
