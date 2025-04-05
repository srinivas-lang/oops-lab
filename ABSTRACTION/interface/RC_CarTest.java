interface RC_Car {
    void drive();    
    void recharge(); 
}

class RemoteControlCar implements RC_Car {
    private double batteryLevel;

    public RemoteControlCar(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void drive() {
        if (batteryLevel > 0) {
            batteryLevel -= 10;
            System.out.println("Driving the remote control car Battery level: " + batteryLevel + "%");
        } else {
            System.out.println("Battery is empty! Please recharge the car.");
        }
    }


    public void recharge() {
        batteryLevel = 100;
        System.out.println("The car has been recharged. Battery level: " + batteryLevel + "%");
    }
}

public class RC_CarTest {
    public static void main(String[] args) {
       
        RemoteControlCar rcCar = new RemoteControlCar(50);

      
        rcCar.drive();  
        rcCar.recharge();  
        rcCar.drive();  
    }
}
