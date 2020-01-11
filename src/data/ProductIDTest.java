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

    @Test
    public void TesttoString() throws Exception {
        ProductID universalpID = new ProductID("123456789abd");
        String universalpID2 = "ProductID{product code='123456789abd'}";
        assertEquals(universalpID2,universalpID.toString());
    }

    @Test
    public void TestEquals() throws Exception {
        ProductID universalpID = new ProductID("123456789abd");
        ProductID universalpID2 = new ProductID("123456789abd");
        assertTrue(universalpID.equals(universalpID2));
    }

    @Test
    public void TestHashCode() throws Exception {
        ProductID universalpID = new ProductID("123456789abd");
        ProductID universalpID2 = new ProductID("123456789abd");
        assertTrue(universalpID.hashCode()==universalpID2.hashCode());
    }
}
