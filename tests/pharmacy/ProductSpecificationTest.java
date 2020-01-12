package pharmacy;

import static org.junit.jupiter.api.Assertions.*;

import data.ProductID;
import data.exceptions.FormatException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class ProductSpecificationTest {
    ProductSpecification product;


    @BeforeEach
    public void setUp() throws NullPointerException, FormatException {
        product = new ProductSpecification(new ProductID("123456789012"), "Bonito, Barato", new BigDecimal("7.234"));
    }

    @Test
    public void getDescription(){
        assertEquals("Bonito, Barato", product.getDescription());
    }

    @Test
    public void getPrice() { assertEquals(new BigDecimal("7.234"), product.getPrice());
    }
}