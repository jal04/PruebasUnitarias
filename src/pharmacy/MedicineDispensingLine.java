package pharmacy;

import data.ProductID;

public class MedicineDispensingLine {
    ProductSpecification productSpecification;
    Boolean acquired;
    public MedicineDispensingLine(ProductSpecification productSpecification){
        this.productSpecification=productSpecification;
        this.acquired=false;
    }
    public boolean getAcquired(){
        return acquired;
    }
    public void productAcquired(){
        this.acquired=true;
    }
    public ProductID getProductID(){
        return this.productSpecification.getUPCcode();
    }
}
