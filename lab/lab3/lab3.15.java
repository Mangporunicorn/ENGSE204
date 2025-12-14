package lab3_15;

import java.util.Scanner;

class User {
    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    public User(String username) {
        this.username = username;
        resetStatus();
    }

    private void resetStatus() {
        failedAttempts = 0;
        isLocked = false;
    }

    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public static void setPolicy(int max) {
        if (max <= 0) {
            System.out.println("Invalid policy.");
            return;
        }
        maxAttempts = max;
        System.out.println("Policy updated.");
    }

    public void login(String password) {
        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if ("pass123".equals(password)) {
            failedAttempts = 0;
            System.out.println("Login successful.");
            return;
        }

        failedAttempts++;

        if (failedAttempts >= maxAttempts) {
            isLocked = true;
            System.out.println("Login failed. Account locked.");
        } else {
            System.out.println(
                "Login failed. " + (maxAttempts - failedAttempts) + " attempts left."
            );
        }
    }
}

public class lab3_15 {

    private static void processCommand(String cmd, Scanner sc, User user) {
        switch (cmd) {
            case "SET_POLICY" -> {
                System.out.println("Enter new max attempts: ");
                int max = sc.nextInt();
                sc.nextLine();
                User.setPolicy(max);
            }
            case "LOGIN" -> {
                System.out.println("Enter password: ");
                String pw = sc.nextLine();
                user.login(pw);
            }
            default -> System.out.println("Invalid command.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        User myUser = new User(input.nextLine());

        System.out.println("Enter number of commands: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter command: ");
            String command = input.nextLine();
            processCommand(command, input, myUser);
        }

        input.close();
    }
}
