package data;
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
            HealthCardID hcardID = new HealthCardID("123456789");
        });

        String expectedMessage = "Incorrect format code.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
        public void TesttoString(){
            HealthCardID hcardID = new HealthCardID("123456789abd");
            String hcardID2 = "HealthCardID{personal code='123456789abd'}";
            assertEquals(hcardID2,hcardID.toString());
        }

        @Test
        public void TestEquals(){
            HealthCardID hcardID = new HealthCardID("123456789abd");
            HealthCardID hcardID2 = new HealthCardID("123456789abd");
            assertTrue(hcardID.equals(hcardID2));
        }

        @Test
        public void TestHashCode(){
            HealthCardID hcardID = new HealthCardID("123456789abd");
            HealthCardID hcardID2 = new HealthCardID("123456789abd");
            assertTrue(hcardID.hashCode()==hcardID2.hashCode());
        }
}
