import java.util.Scanner;

class Shape {
    protected String name;

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Shape c = new Circle("Circle", radius);
        Shape r = new Rectangle("Rectangle", width, height);

        Shape[] shapes = {c, r};

        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }
    }
}
