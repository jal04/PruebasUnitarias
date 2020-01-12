package pharmacy;

import data.ProductID;

import java.math.BigDecimal;

public class ProductSaleLine {
    BigDecimal subtotal;
    ProductID productID;
    PatientContr contr;
    public ProductSaleLine(ProductID productID, BigDecimal subtotal, PatientContr contr){
        this.contr = contr;
        this.productID=productID;
        this.subtotal=subtotal;
    }

    public MedicineDispensingLine getMedicineDispensingLine() {
        return medicineDispensingLine;
    }
}
