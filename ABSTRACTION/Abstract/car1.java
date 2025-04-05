public class car1 {
    public static void main(String[] args) {
        Vehicle v = new Tesla();
        v.displayModel("Tesla Model S");
        v.showSpeed(250);
        v.calculateRange(50, 7.2);
    }
}

abstract class Vehicle {
    abstract void displayModel(String model);
    abstract void showSpeed(int speed);
    abstract void calculateRange(int batteryLevel, double efficiency);
}

class Tesla extends Vehicle {
    void displayModel(String model) {
        System.out.println("Model: " + model);
    }

    void showSpeed(int speed) {
        System.out.println("Top speed: " + speed + " km/h");
    }

    void calculateRange(int batteryLevel, double efficiency) {
        double range = batteryLevel * efficiency;
        System.out.println("Estimated range: " + range + " km");
    }
}
