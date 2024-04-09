public class Main {
    public static void main(String[] args) {
        Temperature temp;

        temp = Temperature.fromKelvin(295.2);
        System.out.println(temp);

        temp = Temperature.fromFahrenheit(98.6);
        System.out.println(temp);
    }
}
