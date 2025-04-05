package scientific;

public class ScientificCalculator {
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double sin(double degree) {
        return Math.sin(Math.toRadians(degree));
    }

    public double cos(double degree) {
        return Math.cos(Math.toRadians(degree));
    }

    public double tan(double degree) {
        return Math.tan(Math.toRadians(degree));
    }

    public double log(double a) {
        return Math.log10(a);
    }

    public double ln(double a) {
        return Math.log(a);
    }
}
