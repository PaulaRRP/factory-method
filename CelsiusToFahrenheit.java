public class CelsiusToFahrenheit implements Converter {

    @Override
    public double convert(double celsius) {
        double result = (celsius * 9.0 / 5.0) + 32;
        return Math.round(result * 100.0) / 100.0;
    }

    @Override
    public String getDescription() {
        return "Celsius to Fahrenheit Converter";
    }
}