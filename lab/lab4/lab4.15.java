import java.util.Scanner;

class AuditRecord {

    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;

        if (logs.length > maxMessages) {
            this.logMessages = new String[maxMessages];
            int start = logs.length - maxMessages;
            for (int i = 0; i < maxMessages; i++) {
                this.logMessages[i] = logs[start + i];
            }
        } else {
            this.logMessages = new String[logs.length];
            for (int i = 0; i < logs.length; i++) {
                this.logMessages[i] = logs[i];
            }
        }
    }

    public static void setMaxMessages(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String message) {

        if (logMessages.length < maxMessages) {
            String[] newLogs = new String[logMessages.length + 1];

            for (int i = 0; i < logMessages.length; i++) {
                newLogs[i] = logMessages[i];
            }

            newLogs[newLogs.length - 1] = message;
            System.out.println(message + " added.");

            return new AuditRecord(user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");

        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i]);
            if (i < logMessages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        sc.nextLine();
        AuditRecord.setMaxMessages(max);

        String user = sc.nextLine();
        AuditRecord record = new AuditRecord(user);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String msg = sc.nextLine();
            record = record.addMessage(msg);
        }

        record.displayLog();
    }
}
