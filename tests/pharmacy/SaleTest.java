package pharmacy;

import data.PatientContr;
import data.ProductID;
import data.exceptions.FormatException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pharmacy.exceptions.SaleClosedException;

import java.math.BigDecimal;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

    public class SaleTest {
        ProductSpecification product1, product2, product3;
        ProductID id1, id2, id3;
        Sale sale;
        PatientContr contr;

        @BeforeEach
        public void setUp() throws NullPointerException, FormatException, ParseException {
            id1 = new ProductID("123456789012");
            id2 = new ProductID("123456789013");
            id3 = new ProductID("123456789014");
            product1 = new ProductSpecification(id1, "A", new BigDecimal(3));
            product2 = new ProductSpecification(id2, "B", new BigDecimal(4));
            product3 = new ProductSpecification(id3, "C", new BigDecimal(5));
            contr = new PatientContr("0.4");

            sale = new Sale("123456789091");
        }

        @Test
        public void addLineTest() throws SaleClosedException {
            sale.addLine(product1.UPCcode, product1.getPrice(), contr);
            assertEquals(id1, sale.getProductID(0));
        }

        @Test
        public void getAmountTest() {
            assertEquals(new BigDecimal("0"), sale.getAmount());
        }

        @Test
        public void calculateFinalAmountTest() throws SaleClosedException{
            sale.addLine(product1.UPCcode, product1.getPrice(), contr);
            sale.addLine(product2.UPCcode, product2.getPrice(), contr);
            sale.addLine(product3.UPCcode, product3.getPrice(), contr);
            sale.calculateFinalAmount();
            assertEquals(new BigDecimal("13").multiply(new BigDecimal("1.21").multiply(new BigDecimal("0.5"))), sale.getAmount());
        }

        @Test
        public void isClosedTest() throws SaleClosedException{
            assertEquals(false, sale.isClosed());
            sale.calculateFinalAmount();
            assertEquals(true, sale.isClosed());
        }

    }
