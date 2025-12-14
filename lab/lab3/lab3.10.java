package lab3_10;

import java.util.Scanner;

class SystemLogger {

    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        return switch (level) {
            case 1 -> "INFO";
            case 2 -> "DEBUG";
            case 3 -> "ERROR";
            default -> "UNKNOWN";
        };
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel < 1 || newLevel > 3) {
            System.out.println("Invalid log level.");
            return;
        }
        currentLogLevel = newLevel;
        System.out.println("Log level set to " + getLevelName(newLevel));
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
        }
    }
}

public class lab3_10 {

    private static void processCommand(String cmd, Scanner sc) {
        switch (cmd) {
            case "SET" -> {
                System.out.println("Enter new log level: ");
                int level = sc.nextInt();
                sc.nextLine();
                SystemLogger.setLogLevel(level);
            }

            case "LOG" -> {
                System.out.println("Enter new log level: ");
                int level = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter message: ");
                String msg = sc.nextLine();
                SystemLogger.log(level, msg);
            }

            default -> System.out.println("Unknown command.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of commands: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter command (SET/LOG): ");
            String command = input.next();
            processCommand(command, input);
        }

        input.close();
    }
}
