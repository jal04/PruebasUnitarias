import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HealthCardIDTest {
    @Test
    void testConstructorNullCode() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            HealthCardID hcardID = new HealthCardID(null);
        });

        String expectedMessage = "code is null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testConstructorIncorrectFormatCode() {
        Exception exception = assertThrows(IncorrectFormatException.class, () -> {
            HealthCardID hcardID = new HealthCardID(incorrectCode);
        });

        String expectedMessage = "Incorrect format code.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
