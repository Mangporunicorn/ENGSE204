import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {

    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {

    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String carModel = sc.nextLine();
        double carRate = sc.nextDouble();
        sc.nextLine();

        String bikeModel = sc.nextLine();
        double bikeRate = sc.nextDouble();

        RentalVehicle v1 = new Car(carModel, carRate);
        RentalVehicle v2 = new Motorcycle(bikeModel, bikeRate);

        RentalVehicle[] vehicles = { v1, v2 };

        double total = 0.0;
        for (RentalVehicle v : vehicles) {
            total += v.calculateFee();
        }

        System.out.println(total);

        sc.close();
    }
}
