import java.util.Scanner;

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String devName = sc.nextLine();
        int devProjects = sc.nextInt();
        sc.nextLine();

        String adminName = sc.nextLine();
        int adminProjects = sc.nextInt();
        sc.nextLine();
        String adminKey = sc.nextLine();

        User u1 = new User("Guest");
        User d1 = new Developer(devName, devProjects);
        User a1 = new Admin(adminName, adminProjects, adminKey);

        User[] users = { u1, d1, a1 };

        int totalClearance = 0;
        for (User u : users) {
            totalClearance += u.getClearanceLevel();
        }

        for (User u : users) {
            if (u instanceof Admin) {
                Admin a = (Admin) u;
                System.out.println(a.getAdminKey());
            }
        }

        System.out.println(totalClearance);
        sc.close();
    }
}
