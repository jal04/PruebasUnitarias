package pharmacy;

import data.ProductID;

import java.math.BigDecimal;

public class ProductSaleLine {
    BigDecimal subtotal;
    ProductID productID;
    ProductSpecification productSpecification;
    public ProductSaleLine(ProductID productID, BigDecimal subtotal){
        this.productID=productID;
        MedicineDispensingLine medicineDispensingLine = new MedicineDispensingLine(productID, productSpecification);
        this.subtotal=subtotal;
    }
}
