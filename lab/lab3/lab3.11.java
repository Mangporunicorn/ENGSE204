package lab3_11;

import java.util.Scanner;

class SystemConfig {
    private static SystemConfig instance;

    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class lab3_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SystemConfig config = SystemConfig.getInstance();

        System.out.print("Enter N: ");
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Enter Command (SET_URL / SET_MAX / SHOW):");
            String cmd = input.next();

            switch (cmd) {

                case "SET_URL":
                    System.out.print("Enter URL: ");
                    String url = input.next();
                    config.setServerUrl(url);
                    break;

                case "SET_MAX":
                    System.out.print("Enter MAX: ");
                    int max = input.nextInt();
                    config.setMaxConnections(max);
                    break;

                case "SHOW":
                    System.out.println("URL: " + config.getServerUrl());
                    System.out.println("MAX: " + config.getMaxConnections());
                    break;

                default:
                    System.out.println("Unknown Command.");
            }
        }
    }
}
