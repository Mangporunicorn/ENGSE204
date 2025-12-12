package lab3_13;

import java.util.Scanner;

class LicenseManager {
    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMax(int max) {
        if (max < 0) {
            System.out.println("Invalid max value.");
            return;
        }
        if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
            return;
        }
        maxLicenses = max;
        System.out.println("Max licenses set to " + max);
    }

    public static boolean checkOut() {
        if (usedLicenses >= maxLicenses) {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }
        usedLicenses++;
        System.out.println("Checkout successful.");
        return true;
    }

    public static void checkIn() {
        if (usedLicenses == 0) {
            System.out.println("Nothing to check-in.");
            return;
        }
        usedLicenses--;
        System.out.println("Check-in successful.");
    }

    public static void displayStatus() {
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + (maxLicenses - usedLicenses));
    }
}

public class lab3_13 {

    private static void handleCommand(String cmd, Scanner sc) {
        switch (cmd) {
            case "SET":
                System.out.print("Enter new max: ");
                int newMax = sc.nextInt();
                sc.nextLine();
                LicenseManager.setMax(newMax);
                break;

            case "CHECKOUT":
                LicenseManager.checkOut();
                break;

            case "CHECKIN":
                LicenseManager.checkIn();
                break;

            case "STATUS":
                LicenseManager.displayStatus();
                break;

            default:
                System.out.println("Invalid command.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of commands: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter command: ");
            String command = input.nextLine().trim();
            handleCommand(command, input);
        }
    }
}
