
public class Phone {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("OnePlus");
        phone.deviceInfo();
        phone.charge();
        phone.checkBattery();
        phone.connectBluetooth();

        System.out.println();

        SmartWatch watch = new SmartWatch("Noise");
        watch.deviceInfo();
        watch.charge();
        watch.checkBattery();
    }
}
interface BatteryPowered {
    void charge();
    void checkBattery();
}

interface BluetoothEnabled {
    void connectBluetooth();
}

class Device {
    String brand;

    Device(String brand) {
        this.brand = brand;
    }

    void deviceInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Smartphone extends Device implements BatteryPowered, BluetoothEnabled {
    Smartphone(String brand) {
        super(brand);
    }

    public void charge() {
        System.out.println(brand + " is charging...");
    }

    public void checkBattery() {
        System.out.println("Battery at 85% for " + brand);
    }

    public void connectBluetooth() {
        System.out.println(brand + " connected to Bluetooth speaker.");
    }
}

class SmartWatch extends Device implements BatteryPowered {
    SmartWatch(String brand) {
        super(brand);
    }

    public void charge() {
        System.out.println(brand + " smartwatch is charging...");
    }

    public void checkBattery() {
        System.out.println("Smartwatch battery: 65%");
    }
}

