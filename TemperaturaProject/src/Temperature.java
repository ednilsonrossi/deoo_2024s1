public class Temperature {

    private double celsius;

    private Temperature(double celsius){
        this.celsius = celsius;
    }

    public static Temperature fromCelsius(double degrees){
        return new Temperature(degrees);
    }

    public static Temperature fromFahrenheit(double degrees){
        return new Temperature((degrees - 32) / 1.8);
    }

    public static Temperature fromKelvin(double degress){
        return new Temperature(degress - 273.15);
    }

    @Override
    public String toString() {
        return String.format("%.3f ºC", celsius);
    }
}
