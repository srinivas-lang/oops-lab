import java.util.Scanner;

class Car {
    private String brand;
    private int currentSpeed;

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.currentSpeed = speed;
        } else {
            System.out.println("Invalid speed! Speed must be between 0 and 200.");
        }
    }

    // Getter for speed
    public int getSpeed() {
        return currentSpeed;
    }

    // Method to slow down the car
    public void brake(int reduceBy) {
        if (reduceBy < 0) {
            System.out.println("Brake value cannot be negative.");
        } else if (currentSpeed - reduceBy >= 0) {
            currentSpeed -= reduceBy;
            System.out.println("Braked by " + reduceBy + " km/h. New speed: " + currentSpeed);
        } else {
            System.out.println("Car is already at minimum speed.");
        }
    }
}

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car myCar = new Car();

        System.out.print("Enter car brand: ");
        String brand = sc.nextLine();
        myCar.setBrand(brand);

        System.out.print("Enter current speed: ");
        int speed = sc.nextInt();
        myCar.setSpeed(speed);

        System.out.print("Enter braking speed: ");
        int brake = sc.nextInt();

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Speed before braking: " + myCar.getSpeed());
        myCar.brake(brake);

        sc.close();
    }
}
