package pharmacy;

import data.ProductID;

import java.math.BigDecimal;

public class ProductSaleLine {
    BigDecimal subtotal;
    ProductID productID;
    ProductSpecification productSpecification;
    MedicineDispensingLine medicineDispensingLine;
    public ProductSaleLine(ProductID productID, BigDecimal subtotal){
        this.productID=productID;
        this.productSpecification = new ProductSpecification();
        this.medicineDispensingLine = new MedicineDispensingLine(productID, productSpecification);
        this.subtotal=subtotal;
    }

    public MedicineDispensingLine getMedicineDispensingLine() {
        return medicineDispensingLine;
    }
}
