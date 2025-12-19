import java.util.Scanner;

class Schedule {
    private int hour;

    public Schedule(int hour) {
        this.hour = hour;
    }

    public Schedule(Schedule other) {
        this.hour = other.hour;
    }

    public void setHour(int newHour) {
        this.hour = newHour;
    }

    public int getHour() {
        return hour;
    }
}

class EmployeeSchedule {
    private String name;
    private Schedule schedule;

    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name;
        this.schedule = new Schedule(other.schedule);
    }

    public void displaySchedule() {
        System.out.println(name + ": " + schedule.getHour() + ":00");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int startHour = sc.nextInt();
        int newHour = sc.nextInt();

        Schedule sch1 = new Schedule(startHour);

        EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);

        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

        sch1.setHour(newHour);

        emp1.displaySchedule();
        emp2.displaySchedule();
    }
}
