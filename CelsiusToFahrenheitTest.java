import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CelsiusToFahrenheitTest {

    private CelsiusToFahrenheit converter;

    @BeforeEach
    public void setUp() {
        converter = new CelsiusToFahrenheit();
    }

    @Test
    public void testConvertZeroCelsius() {
        assertEquals(32.0, converter.convert(0), 0.001);
    }

    @Test
    public void testConvertPositiveValue() {
        assertEquals(33.8, converter.convert(1), 0.001);
    }

    @Test
    public void testConvertNegativeValue() {
        assertEquals(-40.0, converter.convert(-40), 0.001);
    }

    @Test
    public void testConvertDecimalValue() {
        assertEquals(32.9, converter.convert(0.5), 0.001);
    }

    @Test
    public void testGetDescription() {
        assertEquals("Celsius to Fahrenheit Converter", converter.getDescription());
    }
}