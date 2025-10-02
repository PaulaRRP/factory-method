public class FahrenheitToCelsius implements Converter {

    @Override
    public double convert(double fahrenheit) {
        double result = (fahrenheit - 32) * 5.0 / 9.0;
        return Math.round(result * 100.0) / 100.0;
    }

    @Override
    public String getDescription() {
        return "Fahrenheit to Celsius Converter";
    }
}