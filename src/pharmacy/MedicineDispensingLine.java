package pharmacy;

import data.ProductID;

public class MedicineDispensingLine {
    ProductID productID;
    ProductSpecification productSpecification;
    Boolean acquired;
    public MedicineDispensingLine(ProductID productID, ProductSpecification productSpecification){
        this.productID=productID;
        this.productSpecification=productSpecification;
        this.acquired=false;
    }

    public void productAcquired(){
        this.acquired=true;
    }
}
