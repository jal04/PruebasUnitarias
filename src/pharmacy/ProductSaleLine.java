package pharmacy;

import data.ProductID;

import java.math.BigDecimal;

public class ProductSaleLine {
    BigDecimal subtotal;
    public ProductSaleLine(BigDecimal subtotal){
        this.subtotal=subtotal;
    }
}
