import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String id, double baseFee) {
        this.trackingId = id;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {

    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stdId = sc.nextLine();
        double stdFee = sc.nextDouble();
        sc.nextLine();

        String preId = sc.nextLine();
        double preFee = sc.nextDouble();
        double insurance = sc.nextDouble();

        Shipping s1 = new StandardShipping(stdId, stdFee);
        Shipping s2 = new PremiumShipping(preId, preFee, insurance);

        Shipping[] list = { s1, s2 };

        for (Shipping s : list) {
            System.out.println(s.calculateTotalFee());
        }

        sc.close();
    }
}
