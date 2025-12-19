import java.util.Scanner;

class Color {

    private int red;
    private int green;
    private int blue;

    public Color(int r, int g, int b) {
        if (r < 0) {
            red = 0;
        } else if (r > 255) {
            red = 255;
        } else {
            red = r;
        }

        if (g < 0) {
            green = 0;
        } else if (g > 255) {
            green = 255;
        } else {
            green = g;
        }

        if (b < 0) {
            blue = 0;
        } else if (b > 255) {
            blue = 255;
        } else {
            blue = b;
        }
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void displayRGB() {
        System.out.println("R=" + red + ", G=" + green + ", B=" + blue);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        Color color = new Color(r, g, b);
        color.displayRGB();
    }
}
