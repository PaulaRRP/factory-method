import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConverterFactoryTest {

    @Test
    public void testCreateConverterCF_Uppercase() {
        Converter converter = ConverterFactory.createConverter("CF");
        assertNotNull(converter);
        assertTrue(converter instanceof CelsiusToFahrenheit);
    }

    @Test
    public void testCreateConverterCF_Lowercase() {
        Converter converter = ConverterFactory.createConverter("cf");
        assertNotNull(converter);
        assertTrue(converter instanceof CelsiusToFahrenheit);
    }

    @Test
    public void testCreateConverterCF_MixedCase() {
        Converter converter = ConverterFactory.createConverter("Cf");
        assertNotNull(converter);
        assertTrue(converter instanceof CelsiusToFahrenheit);
    }

    @Test
    public void testCreateConverterFC_Uppercase() {
        Converter converter = ConverterFactory.createConverter("FC");
        assertNotNull(converter);
        assertTrue(converter instanceof FahrenheitToCelsius);
    }

    @Test
    public void testCreateConverterFC_Lowercase() {
        Converter converter = ConverterFactory.createConverter("fc");
        assertNotNull(converter);
        assertTrue(converter instanceof FahrenheitToCelsius);
    }

    @Test
    public void testCreateConverterFC_MixedCase() {
        Converter converter = ConverterFactory.createConverter("fC");
        assertNotNull(converter);
        assertTrue(converter instanceof FahrenheitToCelsius);
    }

    @Test
    public void testCreateConverterInvalidType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ConverterFactory.createConverter("XX");
        });
        assertEquals("Invalid converter type: XX", exception.getMessage());
    }

    @Test
    public void testCreateConverterEmptyString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ConverterFactory.createConverter("");
        });
        assertEquals("Invalid converter type: ", exception.getMessage());
    }

    @Test
    public void testCreateConverterNull() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            ConverterFactory.createConverter(null);
        });
    }

    @Test
    public void testCreateConverterWithSpaces() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ConverterFactory.createConverter("C F");
        });
    }

    @Test
    public void testCreateConverterNumericString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ConverterFactory.createConverter("123");
        });
    }
}