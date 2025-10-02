import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class FahrenheitToCelsiusTest {

    private FahrenheitToCelsius converter;

    @BeforeEach
    public void setUp() {
        converter = new FahrenheitToCelsius();
    }

    @Test
    public void testConvertZeroFahrenheit() {
        assertEquals(-17.78, converter.convert(0), 0.001);
    }


    @Test
    public void testConvertPositiveValue() {
        assertEquals(-17.22, converter.convert(1), 0.001);
    }

    @Test
    public void testConvertNegativeValue() {
        assertEquals(-40.0, converter.convert(-40), 0.001);
    }

    @Test
    public void testConvertDecimalValue() {
        assertEquals(-17.5, converter.convert(0.5), 0.001);
    }

    @Test
    public void testGetDescription() {
        assertEquals("Fahrenheit to Celsius Converter", converter.getDescription());
    }
}