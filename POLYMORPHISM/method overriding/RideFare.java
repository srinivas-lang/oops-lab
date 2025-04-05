import java.util.Scanner;

class Transport {
    void showFare(int km) {
        System.out.println("Fare calculation for " + km + " km.");
    }
}

class Bus extends Transport {
    @Override
    void showFare(int km) {
        System.out.println("Bus Fare: ₹" + (km * 8));
    }
}

class Scooter extends Transport {
    @Override
    void showFare(int km) {
        System.out.println("Scooter Fare: ₹" + (km * 4));
    }
}

class Cab extends Transport {
    @Override
    void showFare(int km) {
        System.out.println("Cab Fare: ₹" + (km * 12));
    }
}

public class RideFare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        int km = scan.nextInt();

        Transport t1 = new Bus();
        Transport t2 = new Scooter();
        Transport t3 = new Cab();

        t1.showFare(km);
        t2.showFare(km);
        t3.showFare(km);

        scan.close();
    }
}
