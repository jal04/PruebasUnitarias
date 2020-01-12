package pharmacy;

import data.ProductID;

public class MedicineDispensingLine {
    ProductSpecification productSpecification;
    Boolean acquired;
    public MedicineDispensingLine(ProductSpecification productSpecification){
        this.productSpecification=productSpecification;
        this.acquired=false;
    }
    public void productAcquired(){
        this.acquired=true;
    }
    public ProductID getProductID(){
        return productSpecification.getUPCcode();
    }
}
