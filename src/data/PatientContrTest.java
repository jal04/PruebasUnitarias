package data;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PatientContrTest {
    @Test
    void testConstructorNullCode() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            new PatientContr(null);
        });

        String expectedMessage = "amount is null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    public void TesttoString(){
        PatientContr count = new PatientContr("30.234");
        String count2 = "HealthCardID{amount paid='30.234'}";
        assertEquals(count2,count.toString());
    }

    @Test
    public void TestEquals(){
        PatientContr count = new PatientContr("30.234");
        PatientContr count2 = new PatientContr("30.234");
        assertTrue(count.equals(count2));
    }

    @Test
    public void TestHashCode(){
        PatientContr count = new PatientContr("30.234");
        PatientContr count2 = new PatientContr("30.234");
        assertTrue(count.hashCode()==count2.hashCode());
    }
}
