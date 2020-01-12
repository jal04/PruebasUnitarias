package pharmacy;

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
    public String getProductID(){
        return this.productSpecification.getUPCcode();
    }
}
