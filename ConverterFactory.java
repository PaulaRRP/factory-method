import java.util.Scanner;

public class ConverterFactory {

    public static Converter createConverter(String type) {
        if (type.equalsIgnoreCase("CF")) {
            return new CelsiusToFahrenheit();
        } else if (type.equalsIgnoreCase("FC")) {
            return new FahrenheitToCelsius();
        } else {
            throw new IllegalArgumentException("Invalid converter type: " + type);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println("Choose conversion type:");
        System.out.println("CF - Celsius to Fahrenheit");
        System.out.println("FC - Fahrenheit to Celsius");
        System.out.print("Your choice: ");
        String type = scanner.nextLine();

        try {
            // Factory Method creates the appropriate converter
            Converter converter = createConverter(type);

            System.out.println("\n" + converter.getDescription());
            System.out.print("Enter temperature value: ");
            double value = scanner.nextDouble();

            double result = converter.convert(value);

            System.out.printf("Result: %.2f\n", result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        }

        scanner.close();
    }
}