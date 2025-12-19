import java.util.Scanner;

class TimePeriod {

    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour) {

        if (startHour < 0) {
            startHour = 0;
        } else if (startHour > 23) {
            startHour = 23;
        }

        if (endHour < 0) {
            endHour = 0;
        } else if (endHour > 23) {
            endHour = 23;
        }

        if (startHour > endHour) {
            int temp = startHour;
            startHour = endHour;
            endHour = temp;
        }

        this.startHour = startHour;
        this.endHour = endHour;
    }

    public void displayPeriod() {
        System.out.println(startHour + ":00 - " + endHour + ":00");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mode = sc.nextInt();

        TimePeriod tp;

        if (mode == 1) {
            tp = new TimePeriod();
        } else {
            int start = sc.nextInt();
            int end = sc.nextInt();
            tp = new TimePeriod(start, end);
        }

        tp.displayPeriod();
    }
}
