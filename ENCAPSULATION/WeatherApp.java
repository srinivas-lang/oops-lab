import java.util.Scanner;

class Weather {
    private double temperature;
    private int humidity;


    public Weather(double temperature, int humidity) {
        setTemperature(temperature);
        setHumidity(humidity);
    }


    public void setTemperature(double temperature) {
        if (temperature >= -50 && temperature <= 60) {
            this.temperature = temperature;
        } else {
            System.out.println("Invalid temperature! Must be between -50 and 60°C.");
        }
    }

    public void setHumidity(int humidity) {
        if (humidity >= 0 && humidity <= 100) {
            this.humidity = humidity;
        } else {
            System.out.println("Invalid humidity! Must be between 0% and 100%.");
        }
    }


    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }


    public void displayWeather() {
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Humidity: " + humidity + " %");
    }
}
public class WeatherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter today's temperature (°C): ");
        double temp = sc.nextDouble();

        System.out.print("Enter today's humidity (%): ");
        int hum = sc.nextInt();

        Weather today = new Weather(temp, hum);

        System.out.println("\n--- Today's Weather ---");
        today.displayWeather();

        sc.close();
    }
}
