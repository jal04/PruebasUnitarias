package data;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductIDTest {
    @Test
    void testConstructorNullCode() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            new ProductID(null);
        });

        String expectedMessage = "code is null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testConstructorIncorrectFormatCode() {
        Exception exception = assertThrows(Exception.class, () -> {
            new ProductID("123456");
        });

        String expectedMessage = "Incorrect format code.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
